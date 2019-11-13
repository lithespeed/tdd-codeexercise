package test.unit.com.bankapp;


import main.com.bankapp.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class AccountTest {

    @Test
    public void sendsEmail() {
        // arrange
        Account testSubject = new Account();
        testSubject.deposit(new BigDecimal(3.00));

        EmailService mockEmail = Mockito.mock(EmailService.class);
        testSubject.setEmailService(mockEmail);
        // act
        testSubject.withdraw(new BigDecimal(10.00));

        //assert
        Mockito.verify(mockEmail).sendEmail("from", "to", "change", "blah blah");
        Assert.assertEquals(3, testSubject.getBalance().intValue());
    }

    @Test
    public void itCreatesACheckingAccountWithZeroBalance() {
        // Arrange
        Account testSubject = new Account();
        // Act
        testSubject.setFirstName("Jane");
        testSubject.setLastName("Doe");
        testSubject.setupAccount();
        // Assert
        assertNotNull(testSubject.getAccountNumber());
        Assert.assertEquals(BigDecimal.ZERO, testSubject.getBalance());
    }

    @Test
    public void itDepositsToEmptyAccount() {
        var testSubject = new Account();
        testSubject.deposit(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(100), testSubject.getBalance());
    }

    @Test
    public void itDepositsToAccountWithSomeBalance() {
        var testSubject = new Account();

        testSubject.deposit(BigDecimal.valueOf(100));
        testSubject.deposit(BigDecimal.valueOf(50));

        assertEquals(BigDecimal.valueOf(150), testSubject.getBalance());
    }

    @Test(expected=IllegalArgumentException.class)
    public void itWontAllowNegativeDeposits() {
        Account testSubject = new Account();

        testSubject.deposit(BigDecimal.valueOf(-50));
    }

    @Test
    public void itDebitsOnceFromAccountWithSomeBalance() {
        Account testSubject = new Account();

        testSubject.deposit(BigDecimal.valueOf(100));
        testSubject.withdraw(BigDecimal.valueOf(10.50));

        assertEquals(BigDecimal.valueOf(89.50), testSubject.getBalance());
    }

    @Test
    public void itDebitsFromAccountWithSomeBalanceMultipleTimes() {
        Account testSubject = new Account();

        testSubject.deposit(BigDecimal.valueOf(100));
        testSubject.withdraw(BigDecimal.valueOf(10.50));
        testSubject.withdraw(BigDecimal.valueOf(25));

        assertEquals(BigDecimal.valueOf(64.50), testSubject.getBalance());
    }

    @Test
    public void itReturnsGrandTotal() {
        // Arrange
        Account testSubject = new Account();
        AccountDao mockDao = mock(AccountDao.class);

        List<Double> listOfTransactions = new ArrayList<>();
        listOfTransactions.add(100.0);
        listOfTransactions.add(200.0);

        doReturn(listOfTransactions).when(mockDao).getTransactions();

        testSubject.setAccountDao(mockDao);
        //Act
        double total = testSubject.getGrandTotal();

        //Assert
        assertEquals(300.0, total, 0);
    }

    @Test
    public void itCalculatesTransactionTotals() {
        Account testSubject = new Account();

        Dao mockDao = mock(Dao.class);
        List<Double> transactions = new ArrayList<Double>();
        transactions.add(10.00);
        transactions.add(20.00);
        transactions.add(30.00);
        doReturn(transactions).when(mockDao).getHistory();

        testSubject.setDao(mockDao);

        double total = testSubject.getTotal();
        Assert.assertEquals(total, 60.00, 0.0);
    }

    @Test
    public  void itComputesInterestAmount() {
        // Arrange
        Account testSubject = new Account();
        testSubject.deposit(BigDecimal.valueOf(100));

        RateEngine mockRateEngine = mock(RateEngine.class);
        testSubject.setRateEngine(mockRateEngine);

        doReturn(1).when(mockRateEngine).getCurrentRate();
        //Act
        double accrued = testSubject.getInterestAccrued();
        //Assert
        Assert.assertEquals(1, accrued, 0);
    }

    @Test
    public void itTestsInterestAccural() {
        // arrange
        Account testSubject = spy(new Account());
        testSubject.setBalance(new BigDecimal(100.00));
        doReturn(2).when(testSubject).someUglyLegacyUntestableCodeThatReturnsDailyIntRate(null);

        // act
        int returned = testSubject.calculateInterestAccrued();

        // assert
        Assert.assertEquals(2, returned);
    }
}

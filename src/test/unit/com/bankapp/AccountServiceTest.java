package test.unit.com.bankapp;

import main.com.bankapp.AccountRepository;
import main.com.bankapp.AccountService;
import main.com.bankapp.InsufficientFundsException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountServiceTest {

    @Test
    public void itThrowsExceptionWhenInsufficientFunds() throws InsufficientFundsException {
        // arrange
        double initialBalance = 50.0;
        double withdrawal = 100.0;
        String accountId = "accountId";
        AccountRepository stub = mock(AccountRepository.class);
        AccountService sut = new AccountService(stub);
        doReturn(initialBalance).when(stub).getBalance(accountId);
        // act & assert
        assertThrows(InsufficientFundsException.class,
                () -> sut.withdrawMoney(accountId, withdrawal));
    }

    @Test
    public void itCallsUpdateBalanceWhenSufficientFunds() throws InsufficientFundsException {
        // arrange
        double initialBalance = 100.0;
        double withdrawal = 50.0;
        AccountRepository mock = mock(AccountRepository.class);
        AccountService sut = new AccountService(mock);
        doReturn(initialBalance).when(mock).getBalance(anyString());
        // act
        sut.withdrawMoney("accountId", withdrawal);
        // assert
        verify(mock).updateBalance("accountId", initialBalance - withdrawal);
    }
}

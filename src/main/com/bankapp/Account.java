package main.com.bankapp;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    public EmailService getEmailService() {
        return emailService;
    }

    private EmailService emailService;

    private String mLastName;
    private String mAccountNumber;
    private BigDecimal mBalance = BigDecimal.ZERO;
    private Dao dao = new Dao();

    private StatusDao statusDao;

    public Account(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    private AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountDao accountDao = new AccountDao();

    private RateEngine rateEngine = new RateEngine();

    private Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    private RateEngine getRateEngine() {
        return rateEngine;
    }

    public void setRateEngine(RateEngine rateEngine) {
        this.rateEngine = rateEngine;
    }

    public Account() {}

    public void setFirstName(String firstName) {
        String mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getAccountNumber() {
        return mAccountNumber;
    }

    public BigDecimal getBalance() {
        return mBalance;
    }

    public void setBalance(BigDecimal balance) {
        this.mBalance = balance;
    }

    public boolean setupAccount() {
        mAccountNumber = "0000234002340566"; //TODO: hardcoded account number for now
        mBalance = BigDecimal.ZERO;
        return true;
    }

    public void deposit(BigDecimal amount) {
        if(amount.floatValue() < 0) {
            throw new IllegalArgumentException("Deposit amount invalid");
        }
        BigDecimal newBalance = getBalance().add(amount);
        setBalance(newBalance);
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal newBalance = getBalance().subtract(amount);
        if (newBalance.doubleValue() < 0) {
            getEmailService().sendEmail("from", "to", "change", "blah blah");
        } else {
            setBalance(newBalance);
        }
    }

    public double getTotal() {
        List<Double> history = getDao().getHistory();
        double total = 0;
        for (Double aDouble : history) {
            total += aDouble;
        }
        return total;  //To change body of created methods use File | Settings | File Templates.
    }

    public double getInterestAccrued() {
        return getBalance().doubleValue() * (getRateEngine().getCurrentRate()/100.0);
    }

    public double getGrandTotal() {
        List<Double> values = getAccountDao().getTransactions();
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }

    public int someUglyLegacyUntestableCodeThatReturnsDailyIntRate(String s) {
        // magical mystical rate calculator
        return 25;
    }

    public int calculateInterestAccrued() {
        return getBalance().intValue() * someUglyLegacyUntestableCodeThatReturnsDailyIntRate(null)/100;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }



}
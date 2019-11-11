package main.com.bankapp;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    public EmailService getEmailService() {
        return emailService;
    }

    private EmailService emailService;

    private String mFirstName;
    private String mLastName;
    private String mAccountNumber;
    private BigDecimal mBalance = BigDecimal.ZERO;
    private EmailNotifier emailNotifier = new EmailNotifier();
    private Dao dao = new Dao();

    private DepositDao depositDao = new DepositDao();

    public Account(DepositDao depositDao) {
        this.depositDao = depositDao;
    }

    public StatusDao getStatusDao() {
        return statusDao;
    }

    public void setStatusDao(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    private StatusDao statusDao;

    public Account(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private AccountDao accountDao = new AccountDao();

    private RateEngine rateEngine = new RateEngine();

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public RateEngine getRateEngine() {
        return rateEngine;
    }

    public void setRateEngine(RateEngine rateEngine) {
        this.rateEngine = rateEngine;
    }



    public Account() {};

    public Account(EmailNotifier notifier) {
        this.emailNotifier = notifier;
    }

    public EmailNotifier getEmailNotifier() {
        return emailNotifier;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getAccountNumber() {
        return mAccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.mAccountNumber = accountNumber;
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


//        if (newBalance.doubleValue() < 0) {
//            getEmailNotifier().sendMessage("service@bank.com", "joe@somewhere.com", "Insufficient funds", "blah blah blah");
//        } else {
//            setBalance(newBalance);
//        }
    }

    /*
    public int getInterestAccrued() {

        int currentRate = getRateEngine().getCurrentRate();
        return ((currentRate  * getBalance().intValue())/getBalance().intValue());

    }
    */

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

    public void doSomethingWithStatus() {

        boolean flag = getStatusDao().getStatus();
        if(flag==true) {
            throw new IllegalArgumentException();
        }
    }

    public double computesTotalDeposits() {
        List<Double> deps = depositDao.getDeposits();
        double  totalDeps = 0;
        for (Double dep : deps) {
            totalDeps += dep;
        }
        return totalDeps;
    }




    public int someUglyLegacyUntetstableCodeThatReturnsDailtIntRate(String s) {

        // magical mystical rate calculator

        return 25;
    }

    public int calculateInterestAccrued() {

        return getBalance().intValue() * someUglyLegacyUntetstableCodeThatReturnsDailtIntRate(null)/100;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
}

package main.com.bankapp;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void withdrawMoney(String accountId, double amount) throws InsufficientFundsException {
        double balance = accountRepository.getBalance(accountId);
        if (balance >= amount) {
            accountRepository.updateBalance(accountId, balance - amount);
        } else {
            throw new InsufficientFundsException();
        }
    }
}

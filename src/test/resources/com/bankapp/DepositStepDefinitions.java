package test.resources.com.bankapp;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import main.com.bankapp.Account;
import org.testng.Assert;

import java.math.BigDecimal;

public class DepositStepDefinitions {

    private Account account;

    @Given("^a User has no money in their account$")
    public void a_User_has_no_money_in_their_account() throws Throwable {
        // Express the Regexp above with the code you wish you had
        account = new Account();
        account.setFirstName("Arin");
        account.setLastName("Sime");

    }

    @When("^\\$(\\d+) is deposited in to the account$")
    public void $_is_deposited_in_to_the_account(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        account.deposit(BigDecimal.valueOf(arg1));
    }

    @Then("^the balance should be \\$(\\d+)$")
    public void the_balance_should_be_$(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Assert.assertEquals(100, account.getBalance().intValue());
    }
}

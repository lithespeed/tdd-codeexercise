package test.resources.com.bankapp;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import main.com.bankapp.Account;
import org.testng.Assert;

import java.math.BigDecimal;

public class AccountStepDefinitions {
    Account testSubject;

    @Given("^I provide my personal information$")
    public void I_provide_my_personal_information() throws Throwable {
        testSubject = new Account();
        testSubject.setFirstName("Raj");
        testSubject.setLastName("Indugula");
    }

    @When("^I apply for my first account$")
    public void I_apply_for_my_first_account() throws Throwable {
        testSubject.setupAccount();

    }

    @Then("^I should have a new checking account with zero balance$")
    public void I_should_have_a_new_checking_account_with_zero_balance() throws Throwable {
        Assert.assertEquals(BigDecimal.ZERO, testSubject.getBalance());
    }

    /*
    private Account account;

    @Given("^I provide my personal information$")
    public void I_provide_my_personal_information() throws Throwable {
        // Express the Regexp above with the code you wish you had
        account = new Account();
        account.setFirstName("Arin");
        account.setLastName("Sime");
    }

    @When("^I apply for my first account$")
    public void I_apply_for_my_first_account() throws Throwable {
        // Express the Regexp above with the code you wish you had
        account.setupAccount();
    }

    @Then("^I should have a new checking account with zero balance$")
    public void I_should_have_a_new_checking_account_with_zero_balance() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertTrue("Error msg here", account.getBalance() == BigDecimal.ZERO);
    }
    */
}

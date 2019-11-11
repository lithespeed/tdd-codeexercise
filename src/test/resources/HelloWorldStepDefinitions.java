package test.resources;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import main.com.HelloWorld;
import org.junit.Assert;

public class HelloWorldStepDefinitions {



    HelloWorld testSubject;
    String message;

    @Given("^I want to be greeted$")
    public void I_want_to_be_greeted() throws Throwable {
        testSubject = new HelloWorld("");

    }

    @When("^I execute the application$")
    public void I_execute_the_application() throws Throwable {

        message = testSubject.sayHello();
    }

    @Then("^I should see the default message$")
    public void I_should_see_the_default_message() throws Throwable {
        Assert.assertEquals("Hello World", message);
    }


}

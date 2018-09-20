package test.resources;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import main.HelloWorld;


import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: Raj
 * Date: 3/7/13
 * Time: 6:00 AM
 * To change this template use File | Settings | File Templates.
 */

public class HelloWorldStepDefinitions {

    HelloWorld helloWorld;
    String message;

    @Given("^I want to display Hello World$")
    public void I_want_to_display_Hello_World() throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

    @When("^I execute the application$")
    public void I_execute_the_application() throws Throwable {
        // Express the Regexp above with the code you wish you had
        helloWorld = new HelloWorld();
        message = helloWorld.getMessage();
    }

    @Then("^I should see the message$")
    public void I_should_the_message() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertEquals("Hello World", message);
    }
}

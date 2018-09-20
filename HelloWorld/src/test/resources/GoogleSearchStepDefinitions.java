package test.resources;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: Raj
 * Date: 4/2/13
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleSearchStepDefinitions {

    WebDriver driver;

    @Given("^The search is Hello World$")
    public void theSearchIsHelloWorld() {
        driver = new HtmlUnitDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
    }

    @When("^The Search is performed$")
    public void theSearchIsPerformed() {
        driver.findElement(By.xpath("//input[@name='btnG']")).click();
    }

    @Then("^The browser title should have Hello World$")
    public void theBrowserTitleShouldHaveHelloWorld() {
        assertThat ("Browser title:",driver.getTitle(), containsString("Hello World"));
        driver.quit();
    }

}

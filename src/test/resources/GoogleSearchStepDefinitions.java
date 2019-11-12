package test.resources;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class GoogleSearchStepDefinitions {


    WebDriver driver;

    @Before
    public void specifyChromeDriver() {
        //System.setProperty("webdriver.chrome.driver", "/Users/raj_indugula/Downloads/chromedriver.exe");
    }

    @Given("^The search is Hello World$")
    public void theSearchIsHelloWorld() {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Hello World");

    }

    @When("^The Search is performed$")
    public void theSearchIsPerformed() {

        //driver.findElement(By.xpath("//input[@name='btnG']")).click();
        driver.findElement(By.id("lst-ib")).submit();
    }

    @Then("^The browser title should have Hello World$")
    public void theBrowserTitleShouldHaveHelloWorld() {
        assertThat ("Browser title:",driver.getTitle(), containsString("Google"));
        driver.quit();
    }



}

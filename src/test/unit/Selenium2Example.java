package test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Selenium2Example {

    @Before
    public void specifyChromeDriver() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    }

    @Test
    public void itSearchesForXPAndFindsKentBeck() throws Exception {
        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        // Act
        searchBox.sendKeys("extreme programming");
        searchBox.submit();
        //driver.findElement(By.xpath("//input[@name='go']")).click();

        // Assert
        assertTrue((driver.getPageSource()).contains("Kent Beck"));
        driver.quit();
    }

    @Test
    public void itSearchesForAgileOnNoblis() {

        // arrange
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.noblis.org/Search");

        WebElement srchField = webDriver.findElement(By.name("searchQuery"));

        srchField.sendKeys("Agile");

        srchField.submit();

        assertTrue(webDriver.getPageSource().contains("Found 13 results for \"Agile\""));

        // act

        // assert
    }

    @Test
    public void itVerifiesWeCanGetToDoingBizWithUs() {

        // arrange
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.freddiemac.com");

        WebElement anchor = webDriver.findElement(By.id("dobiz_a"));


        // act
        anchor.click();

        // assert
        //Assert.assertTrue(webDriver.getPageSource().contains("raj"));

        webDriver.quit();
    }

    @Test
    public void itSearchesForTribalDirectory() {

        // arrange
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.bia.gov");

       WebElement srchBox = webDriver.findElement(By.id("query-field"));
       WebElement goBtn = webDriver.findElement(By.name("sa"));


        // act
        srchBox.sendKeys("tribal directory");
        goBtn.click();

        // assert
        Assert.assertTrue(webDriver.getPageSource().contains("raj"));


    }


    @Test
    public void itSearchesForDoingBizWithUs() {

        // arrange
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://www.freddiemac.com");

        // act
        WebElement link = webdriver.findElement(By.id("desktop-singlefamily-home"));
        link.click();

        // assert
        assertTrue(webdriver.getPageSource().contains("Mortgage Funding")) ;

        webdriver.quit();

    }

    @Test
    public void itSearchesForSupport() {

        // Instantiate a webDriver implementation
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://blackboard.com");

        WebElement srch = webdriver.findElement(By.name("q"));
        srch.sendKeys("support");
        srch.submit();
    }

    @Test
    public void itSearchesForManageId() {

        // Instantiate a webDriver implementation
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://www.citi-us.com");
        WebElement webElement = webdriver.findElement(By.id("SearchBox"));

        webElement.sendKeys("manageid");
        webElement.submit();

        webdriver.quit();
    }


    @Test
    public void itTriesToLgInWithInvalidCreds() throws InterruptedException {

        // Instantiate a webDriver implementation
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://collegeboard.org");

        WebElement uname = webdriver.findElement(By.name("username"));
        WebElement pass = webdriver.findElement(By.name("password"));

        uname.sendKeys("raj");
        pass.sendKeys("blah");
        pass.submit();


        assertTrue(webdriver.getPageSource().contains("You're logged in"));

        webdriver.quit();
    }



    @Test
    public void itValidatesThePresenceOfLinkToAvailablePlans() {

        // Instantiate a webDriver implementation
        WebDriver webdriver = new ChromeDriver();

        webdriver.get("https://github.com");

        List<WebElement> webElements = webdriver.findElements(By.cssSelector("p.subheading"));

        // Retrieve the anchor
        WebElement anchor1 = webElements.get(0).findElement(By.tagName("a"));

        // Assertions
        Assert.assertEquals("Private plans start at $7/mo.", anchor1.getText());

        webdriver.quit();
    }

    @Test
    public void itSearchesForPredictable() {

        // Instantiate a webDriver implementation
        WebDriver webdriver = new ChromeDriver();

        webdriver.get("https://www.reliant.com");


        WebElement searchAnchor = webdriver.findElement(By.cssSelector("a.search"));
        searchAnchor.click();

        WebElement searchInput = webdriver.findElement(By.id("headerSearchBox"));

        searchInput.sendKeys("predictable");


        searchInput.submit();



        // Assertions
       //

        //webdriver.quit();
    }

    @Test
    public void itChecksForHotelsInManassas() {

        // arrange
        WebDriver webdriver = new ChromeDriver();

        webdriver.get("http://marriott.com");


        // act
        WebElement location = webdriver.findElement(By.id("search-location"));
        location.sendKeys("Manassas");
        location.submit();


        //assert
        assertTrue(webdriver.getPageSource().contains("130 hotels"));
        webdriver.quit();
    }

    @Test
    public void searchForGoes() throws Exception {

        // instantiate the driver
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("http://www.cbp.gov/");

        WebElement searchBox = webdriver.findElement(By.id("edit-search-block-form--2"));
        searchBox.sendKeys("goes");
        WebElement submitBtn = webdriver.findElement(By.id("edit-submit"));
        submitBtn.click();

        assertTrue(webdriver.getPageSource().contains("NEXUS"));
        webdriver.quit();

    }




    @Test
    //http://automationpractice.com/
    public void itSearchesForHawaii() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("http://phptravels.net");

        WebElement searchBox = driver.findElement(By.name("txtSearch"));

        searchBox.sendKeys("Hawaii");
        searchBox.submit();
        //driver.findElement(By.xpath("//input[@name='go']")).click();

        //assertTrue((driver.getPageSource()).contains("Kent Beck"));
        driver.quit();
    }




}

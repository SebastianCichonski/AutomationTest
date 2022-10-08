package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import pages.BasePage;

import java.time.Duration;

import static support.Browser.newBrowser;

public class ConfigurationTests {
    protected WebDriver driver;
    static Logger LOG = LoggerFactory.getLogger(ConfigurationTests.class);

    @BeforeClass
    public void setUpClass() {
        LOG.info("@BeforeClass");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpMethod() {
        LOG.info("@BeforeMethod");
        driver = newBrowser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void tearDown() {
        LOG.info("@AfterClass");
        driver.quit();
    }
}

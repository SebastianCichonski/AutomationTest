package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.ConfigurationTests;

public class Browser {
    static Logger LOG = LoggerFactory.getLogger(Browser.class);
    private static WebDriver driver;

    private Browser(){}

    public static WebDriver newBrowser(){
        LOG.info("class: Browser, method: newBrowser");
        if(driver == null) {
            //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}

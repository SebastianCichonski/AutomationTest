package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static support.Browser.newBrowser;

public class BasePage {
    static Logger LOG = LoggerFactory.getLogger(BasePage.class);
    protected Faker faker;

    public BasePage() {
        LOG.info("class: BasePage, method: constructor");
        PageFactory.initElements(newBrowser(),this);
        faker = new Faker();
    }
}

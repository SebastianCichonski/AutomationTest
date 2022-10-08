package pages;

import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.ConfigurationTests;

public class AutenticationPage extends BasePage{
    static Logger LOG = LoggerFactory.getLogger(AutenticationPage.class);

    public AutenticationPage() {
        super();
        LOG.info("class: AutenticationPage, method: constructor");
    }

    @FindBy(id = "email_create")
    private WebElement inputEmailAddress;

    @FindBy(id = "SubmitCreate")
    private WebElement buttonCreateAccount;

    @Step
    @Story("Wpisz adres email")
    public AutenticationPage inputEmail(){
        LOG.info("class: AutenticationPage, method: inputEmail");
        String email = faker.internet().emailAddress();
        inputEmailAddress.sendKeys(email);
        return this;
    }

    @Step
    @Story("Naciśnij przycisk 'Create Account'")
    public void clickCreateAccount(){
        LOG.info("class: AutenticationPage, method: clickCreateAccount");
        buttonCreateAccount.click();
    }
}

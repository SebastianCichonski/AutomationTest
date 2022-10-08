package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    public HomePage() {
        super();
        LOG.info("class: HomePage, method: constructor");
    }

    @FindBy(css = "[class=login]")
    private WebElement sigIn;

    @Step
    public AutenticationPage clickSignIn(){
        LOG.info("class: HomePage, metod: clickSignIn");
        sigIn.click();
        return new AutenticationPage();
    }
}

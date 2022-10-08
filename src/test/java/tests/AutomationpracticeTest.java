package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;


public class AutomationpracticeTest extends ConfigurationTests {

    @Test
    @Description("This test case help me validate create account method")
    @Severity(SeverityLevel.NORMAL)
    @Story("[JIRA 456-345] This story check the 'Create account' function")
    @Feature("Create Account")
    void sigInTest() throws InterruptedException {
        LOG.info("@Test - 01");
        new HomePage()
                .clickSignIn()
                .inputEmail()
                .clickCreateAccount();

        Assert.assertEquals(getPageUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Thread.sleep(5000);
    }

    private void clickCreateAccount() {
        WebElement buttonCreateAccount = driver.findElement(By.id("SubmitCreate"));
        buttonCreateAccount.click();
    }

    private String getPageUrl() {
        return driver.getCurrentUrl();
    }

    private void inputEmail() {
        WebElement emailAddressImput = driver.findElement(By.id("email_create"));
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        emailAddressImput.sendKeys(email);
    }

    private void clickSignIn() {
        WebElement sigIn = driver.findElement(By.className("login"));
        sigIn.click();
    }

    @Test
    @Description("This test case help me validate sign in method")
    @Severity(SeverityLevel.NORMAL)
    @Story("[JIRA 423-346] This story check the 'Sig In' link")
    @Feature("Sign In")
    void sigInTest1() throws InterruptedException {
        LOG.info("@Test - 02");
        new HomePage()
                .clickSignIn();

        Assert.assertEquals(driver.getTitle(),"Login - My Store");
        Thread.sleep(5000);
    }
}

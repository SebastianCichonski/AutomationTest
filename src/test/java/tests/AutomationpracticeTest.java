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

        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Thread.sleep(5000);
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

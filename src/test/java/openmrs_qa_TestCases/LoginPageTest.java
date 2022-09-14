package openmrs_qa_TestCases;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import util.TestUtil;

import java.time.Duration;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    TestUtil testUtil;

    LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();


    }

    @Test(priority = 1)
    public void logintest(){
        Assert.assertEquals(loginPage.LoginPageTitle(),prop.getProperty("Logintitle"));
    }


    public void test3(WebElement wel, int j){

        new FluentWait(driver).
                withTimeout(Duration.ofSeconds(j)).
                pollingEvery(Duration.ofSeconds(j)).ignoring(Exception.class);

    }


}

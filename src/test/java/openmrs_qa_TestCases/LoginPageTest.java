package openmrs_qa_TestCases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import util.TestUtil;

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



}

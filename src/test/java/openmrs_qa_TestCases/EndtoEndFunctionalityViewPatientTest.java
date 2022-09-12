package openmrs_qa_TestCases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardInpatientWard;
import pages.LoginPage;
import pages.RegisterPatient;
import pages.viewPatient;
import util.TestUtil;

public class EndtoEndFunctionalityViewPatientTest extends TestBase {


    LoginPage loginPage;
    TestUtil testUtil;
    DashboardInpatientWard dashboard;
    RegisterPatient regpt;
    viewPatient viewpt;

    EndtoEndFunctionalityViewPatientTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboard = new DashboardInpatientWard();
        regpt = new RegisterPatient();
        viewpt = new viewPatient();


    }
    @Test(description = "E2Etest", priority = 1)
    public void endtoEndtest(){
        loginPage.loginInPatientWard(prop.getProperty("Username"), prop.getProperty("Password"), prop.getProperty("location") );
        dashboard.RegisterPatient();
        regpt.RegisterPatient();
        Assert.assertTrue(viewpt.logopresent());
        Assert.assertTrue(viewpt.verifyFirstName());
        Assert.assertTrue(viewpt.verifyLastName());
        viewpt.deletepatient();




    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}

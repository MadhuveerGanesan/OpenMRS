package pages;

import base.TestBase;
import lombok.extern.java.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardInpatientWard extends TestBase {

    //Page Factory to Find WebElements

    //Logout Button
    @FindBy(xpath = "//*[contains(text(),'Logout')]")
    WebElement Logout;

    //Find Patient Record
    @FindBy(xpath = "//a[@type='button' and contains(., 'Find Patient Record')]")
    WebElement PatientRecord;

    //Register Patient
    @FindBy(xpath = "//a[@type='button' and contains(., 'Register a patient')]")
    WebElement RegisterPatient;

    //Initializing the Page Objects
    public DashboardInpatientWard(){
        PageFactory.initElements(driver, this);
    }

    //Functional Actions
    public PatientRecord FindPatientRecord(){
        PatientRecord.click();
        return new PatientRecord();
    }

    public RegisterPatient RegisterPatient(){
        RegisterPatient.click();
        return new RegisterPatient();
    }

    public LoginPage Logout(){
        Logout.click();
        return  new LoginPage();
    }




}

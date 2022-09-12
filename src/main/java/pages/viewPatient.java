package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewPatient extends TestBase {

    @FindBy(className = "logo")
    WebElement logoToMainScreen;

    @FindBy(className = "PersonName-givenName")
    WebElement Firstname;

    @FindBy(className = "PersonName-familyName")
    WebElement LastName;

    @FindBy(partialLinkText = "Delete Patient")
    WebElement deletePatient;





    public viewPatient(){
        PageFactory.initElements(driver, this);
    }

    public DashboardInpatientWard clickLogo(){
        logoToMainScreen.click();
        return new DashboardInpatientWard();
    }

    public boolean logopresent(){
        logoToMainScreen.isDisplayed();
        return true;
    }

    public boolean verifyFirstName(){
        if(Firstname.getText()==prop.getProperty("Madhuveer")){
            return true;
        }else
            return false;
    }
    public boolean verifyLastName(){
        if(LastName.getText()==prop.getProperty("Ganesan")){
            return true;
        }else
            return false;
    }

    public void deletepatient(){
        deletePatient.click();
    }




}

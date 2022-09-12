package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory to Find WebElements

    //UserName TextBox
    @FindBy(name = "username")
    WebElement username;

    //Password TextBox
    @FindBy(name = "password")
    WebElement password;

    //Ward Selection Text link (Inpatient Ward)
    @FindBy(id = "Inpatient Ward")
    WebElement InpatientWard;

    //Ward Selection Text link (Isolation Ward")
    @FindBy(id = "Isolation Ward")
    WebElement IsolationWard;

    //Ward Selection Text link (Laboratory)
    @FindBy(id = "Laboratory")
    WebElement Laboratory;

    //Ward Selection Text link (Outpatient Clinic)
    @FindBy(id = "Outpatient Clinic")
    WebElement OutpatientClinic;

    //Ward Selection Text link (Pharmacy)
    @FindBy(id = "Pharmacy")
    WebElement Pharmacy;

    //Ward Selection Text link (Registration Desk)
    @FindBy(id = "Registration Desk")
    WebElement RegistrationDesk;

    //Login Button
    @FindBy(id = "loginButton")
    WebElement loginButton;

    //Initializing the Page Objects
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Functional Actions
    public String LoginPageTitle(){
        return driver.getTitle();
    }
    public DashboardInpatientWard loginInPatientWard(String username, String password,String location){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        if(location.equalsIgnoreCase("Inpatient Ward")){
            this.InpatientWard.click();
        }else if (location.equalsIgnoreCase("Isolation Ward")){
            this.IsolationWard.click();
        }else if (location.equalsIgnoreCase("Laboratory")){
            this.Laboratory.click();
        }else if (location.equalsIgnoreCase("Outpatient Clinic")){
            this.OutpatientClinic.click();
        }else if (location.equalsIgnoreCase("Pharmacy")){
            this.Pharmacy.click();
        }else if (location.equalsIgnoreCase("Registration Desk")){
            this.RegistrationDesk.click();
        }
            this.loginButton.click();

return new DashboardInpatientWard();
    }


}

package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRecord extends TestBase {

//  //*[@id="patient-search-results-table"]/tbody/tr[2]/td[2]

String PatientName = prop.getProperty("PatientName");

    WebElement addedPatient;
    WebElement ele;

    By patienttableele = By.xpath("//*[@id='patient-search-results-table']/tbody/tr");

    @FindBy(xpath = "//*[@id='patient-search-results-table']/tbody/tr")
    WebElement patientTable;

    @FindBy(id = "patient-search-results-table_next")
    WebElement nextButton;




    public void getxpath(){
      String tablesize=  patientTable.getSize().toString();
      int tablesizeint = Integer.parseInt(tablesize);

        for (int i=1; i<=tablesizeint; i++){
            ele = driver.findElement(
                    By.xpath("//*[@id='patient-search-results-table']/tbody/tr["+i+"]/td[2]"));
            if(ele.isDisplayed()&&ele.getText().equalsIgnoreCase(PatientName)){
                this.addedPatient = ele;
            }else if (i==tablesizeint && nextButton.isEnabled()){
                nextButton.click();
                untilvisibilitywait(patienttableele);
            }


        }
    }

    PatientRecord(){
        PageFactory.initElements(driver, this);
    }

    public viewPatient navigateViewPatient(){
        addedPatient.click();
        return new viewPatient();
    }
}

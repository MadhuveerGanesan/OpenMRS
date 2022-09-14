package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatient extends TestBase {

    //public static WebElement nextButton = driver.findElement(By.id("next-button"));
    public static By nextButton = By.id("next-button");
    public static String Birthmonth = prop.getProperty("Month_Of_Birth");
    public static String RelationshipType = prop.getProperty("relationshiptoPatient");

    @FindBy(id = "fr8534-field")
    WebElement FirstName;

    @FindBy(id = "fr5042-field")
    WebElement LastName;

    @FindBy(id = "checkbox-unknown-patient")
    WebElement CheckboxUnidentifiedPatient;

    @FindBy(id = "next-button")
    WebElement nextScreenButton;

    @FindBy(id = "gender-field")
    WebElement selectGender;

    @FindBy(id = "birthdateDay-field")
    WebElement birthDay;

    @FindBy(id = "birthdateMonth-field")
    WebElement selectBirthMonth;

    @FindBy(id = "birthdateYear-field")
    WebElement birthYear;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "cityVillage")
    WebElement city;

    @FindBy(id = "stateProvince")
    WebElement state;

    @FindBy(id= "country")
    WebElement country;

    @FindBy(id="postalCode")
    WebElement postalCode;

    @FindBy(id = "fr5140-field")
    WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    WebElement relationship_type;

    @FindBy(className = "person-typeahead ng-pristine ng-valid ng-empty ng-touched")
    WebElement patientRelationName;

    @FindBy(id = "submit")
    WebElement submitForm;





    public RegisterPatient(){
        PageFactory.initElements(driver, this);
    }

    public static void test(By txt){
        untilvisibilitywait(txt);
    }

    public static void selectoption(WebElement elem, String strg){
        Select sc = new Select(elem);
        sc.selectByVisibleText(strg);
    }

    public viewPatient RegisterPatient(){
        FirstName.sendKeys(prop.getProperty("Firstname"));
        LastName.sendKeys(prop.getProperty("LastName"));
        nextScreenButton.click();
        test(nextButton);
        selectoption(selectGender,prop.getProperty("Gender"));
        nextScreenButton.click();
        test(nextButton);
        birthDay.sendKeys(prop.getProperty("Day_Of_Birth"));
        selectoption(selectBirthMonth, Birthmonth);
        birthYear.sendKeys(prop.getProperty("Year_Of_Birth"));
        test(nextButton);
        address1.sendKeys(prop.getProperty("Address_Door_Number"));
        address2.sendKeys(prop.getProperty("Address_Street"));
        city.sendKeys(prop.getProperty("Address_City"));
        state.sendKeys(prop.getProperty("Address_State"));
        country.sendKeys(prop.getProperty("Address_Country"));
        postalCode.sendKeys(prop.getProperty("Address_PostalCode"));
        nextScreenButton.click();
        test(nextButton);
        phoneNumber.sendKeys(prop.getProperty("Phonenumber"));
        nextScreenButton.click();
        test(nextButton);
        selectoption(relationship_type,RelationshipType);
        patientRelationName.sendKeys(prop.getProperty("nameOfRelation"));
        nextScreenButton.click();
        submitForm.click();

        return new viewPatient();


    }








}

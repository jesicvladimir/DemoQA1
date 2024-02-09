package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends BaseTest {

    public WebTablesPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "userEmail")
    public WebElement emailField;

    @FindBy(id = "age")
    public WebElement ageField;

    @FindBy(id = "salary")
    public WebElement salaryField;

    @FindBy(id = "department")
    public WebElement departmentField;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(className = "rt-tbody")
    public WebElement fullTable;

    @FindBy(id="delete-record-4")
    public WebElement record4;

    @FindBy(id="delete-record-6")
    public WebElement record6;





    public void clickOnAddButton(){
        addButton.click();
    }

    public void inputFirstName(String name){
        firstNameField.clear();
        firstNameField.sendKeys(name);
    }

    public void inputLastName(String lname){
        lastNameField.clear();
        lastNameField.sendKeys(lname);
    }
    public void inputAge(String age1){
        ageField.clear();
        ageField.sendKeys(age1);
    }
    public void inputEmail1(String email1){
        emailField.clear();
        emailField.sendKeys(email1);
    }
    public void inputSalary(String salary1){
        salaryField.clear();
        salaryField.sendKeys(salary1);
    }
    public void inputDepartment(String department1){
        departmentField.clear();
        departmentField.sendKeys(department1);
    }

    public void clickOnSubmit(){
        submit.click();
    }

    public void deleteElements(){
        record4.click();
        record6.click();
    }
}

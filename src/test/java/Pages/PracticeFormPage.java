package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class PracticeFormPage extends BaseTest {
    public PracticeFormPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName2;

    @FindBy(id = "lastName")
    public WebElement lastName2;

    @FindBy (id = "userEmail")
    public WebElement email2;

    @FindBy (id = "userNumber")
    public WebElement userNumber2;

    @FindBy (id = "currentAddress")
    public WebElement currentAddress1;

    @FindBy(id="dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy (css="label[for='gender-radio-1']")
    public WebElement gender;

    @FindBy(id="submit")
    public WebElement submit2;

    @FindBy (id="hobbies-checkbox-1")
    public WebElement hobbies;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement dateMonth;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement dateYear;

    @FindBy(css="div[role='option']")
    public List<WebElement> dateDay;

    @FindBy(className = "modal-content")
    public WebElement formWindow;

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void inputFirstName2() {
       firstName2.sendKeys("Thierry");
    }

    public void inputLastName2() {
        lastName2.sendKeys("Henry");
    }

    public void inputMobileNumber2() {
        userNumber2.sendKeys("0235647886");
    }


    public void chooseGender() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", gender);
    }

    public void chooseHobby() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", hobbies);
    }

    public void clickOnSubmit2() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", submit2);


    }

    public void inputEmail2() {
        email2.clear();
        email2.sendKeys("henry@gmail.com");
    }


    public void inputDateOfBirth(String month, String year, String day) {
       dateOfBirth.click();

        Select selectMonth = new Select(dateMonth);
        selectMonth.selectByVisibleText(month);

        Select selectYear = new Select(dateYear);
        selectYear.selectByVisibleText(year);

        for (int i = 0; i < dateDay.size(); i++) {
            if (dateDay.get(i).getText().equals(day)) {
                dateDay.get(i).click();
                break;
            }
        }
    }

    public void inputCurrentAddress1(){
        currentAddress1.sendKeys("Indian Street");
    }


}

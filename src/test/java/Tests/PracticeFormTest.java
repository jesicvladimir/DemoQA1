package Tests;

import Base.BaseTest;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeFormTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        formsPage = new FormsPage();
        practiceFormPage = new PracticeFormPage();
        homePage.clickOnCard("Forms");
        formsPage.clickOnPF("Practice Form");

    }

    @Test (priority=10)
    public void userCanFillFormWithJustMandatoryFields() {
        practiceFormPage.inputFirstName2();
        practiceFormPage.inputLastName2();
        practiceFormPage.chooseGender();
        practiceFormPage.inputMobileNumber2();
        practiceFormPage.clickOnSubmit2();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
        Assert.assertTrue(practiceFormPage.formWindow.isDisplayed());
    }

    @Test (priority = 20)
    public void userCanFillFormWithMoreFields(){
        practiceFormPage.inputFirstName2();
        practiceFormPage.inputLastName2();
        practiceFormPage.inputEmail2();
        practiceFormPage.inputDateOfBirth("August", "1977", "17");
        practiceFormPage.chooseGender();
        practiceFormPage.inputMobileNumber2();
        practiceFormPage.chooseHobby();
        practiceFormPage.inputCurrentAddress1();
        practiceFormPage.clickOnSubmit2();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
        Assert.assertTrue(practiceFormPage.formWindow.isDisplayed());


    }
}

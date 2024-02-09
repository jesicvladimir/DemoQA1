package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        homePage = new HomePage();
        elementsPage = new ElementsPage();
        textBoxPage = new TextBoxPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnTextBox();

    }

    @Test (priority = 10)
    public void userCanSubmitForm(){
        textBoxPage.inputFullName();
        textBoxPage.inputEmail();
        textBoxPage.inputCurrentAddress();
        textBoxPage.inputPermanentAddress();
        textBoxPage.clickOnSubmitButton();

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/text-box");
        Assert.assertTrue(textBoxPage.textBoxForm.isDisplayed());


    }

    @Test (priority = 20)
    public void userCanSubmitFormWithoutEmail(){
        textBoxPage.inputFullName();
        textBoxPage.inputCurrentAddress();
        textBoxPage.inputPermanentAddress();
        textBoxPage.clickOnSubmitButton();

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/text-box");
        Assert.assertTrue(textBoxPage.textBoxForm.isDisplayed());
    }




}

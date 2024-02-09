package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.RadioButtonPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtonTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        homePage = new HomePage();
        elementsPage = new ElementsPage();
        radioButtonPage = new RadioButtonPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnRadioButton();
    }

    @Test (priority = 10)
    public void userCanSelectAnswerYes(){
        radioButtonPage.clickOnYes();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
        Assert.assertEquals(radioButtonPage.selectedAnswer.getText(), "You have selected Yes");
    }
    @Test (priority=20)
    public void userCanSelectAnswerImpressive(){
        radioButtonPage.clickOnImpressive();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
        Assert.assertEquals(radioButtonPage.selectedAnswer.getText(), "You have selected Impressive");
    }
}

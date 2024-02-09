package Tests;

import Base.BaseTest;
import Pages.CheckBoxPage;
import Pages.ElementsPage;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        homePage = new HomePage();
        elementsPage = new ElementsPage();
        checkBoxPage= new CheckBoxPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnCheckBox();
        checkBoxPage.clickOnPlus();
    }


    @Test(priority =10)
    public void userCanOpenAndCloseMenu() throws InterruptedException {
        Thread.sleep(3000);
        checkBoxPage.clickOnMinus();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }

    @Test (priority=20)
    public void userCanSelectReact()  {
        checkBoxPage.clickOnPlus();
        checkBoxPage.selectOption("React");

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
        Assert.assertEquals(checkBoxPage.youHaveSelected.getText(), "You have selected :\n" +
                "react");

    }



}

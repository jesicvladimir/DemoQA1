package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.ElementsPage;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonsTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        homePage = new HomePage();
        elementsPage = new ElementsPage();
        buttonsPage = new ButtonsPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnButtons();

    }

    @Test (priority = 10)
    public void userCanDoubleClick(){
        Actions act = new Actions(driver);
        act.doubleClick(buttonsPage.doubleClickButton).perform();

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/buttons");
        Assert.assertEquals(buttonsPage.doubleClickMessage.getText(), "You have done a double click");
    }

    @Test (priority= 20)
    public void userCanRightClick(){
        Actions act2=new Actions(driver);
        act2.contextClick(buttonsPage.rightClickButton).perform();

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/buttons");
        Assert.assertEquals(buttonsPage.rightClickMessage.getText(), "You have done a right click");
    }


        @Test (priority = 30)
        public void userCanClickOnClickOnMeButton()  {
           buttonsPage.clickOnButton("Click Me");

            Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/buttons");
            Assert.assertEquals(buttonsPage.dynamicClickMessage.getText(), "You have done a dynamic click");
        }





}

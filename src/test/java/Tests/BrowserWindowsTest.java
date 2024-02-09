package Tests;

import Base.BaseTest;
import Pages.AlertsFrameWindowsPage;
import Pages.BrowserWindowsPage;
import Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserWindowsTest extends BaseTest {

   @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        alertsFrameWindowsPage = new AlertsFrameWindowsPage();
        browserWindowsPage = new BrowserWindowsPage();
        homePage.clickOnCard("Alerts, Frame & Windows");
        alertsFrameWindowsPage.clickOnAlertsFrameWindowsCard("Browser Windows");


    }

    @Test (priority = 10)
    public void userCanOpenNewTab(){
       browserWindowsPage.clickOnNewTabButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");
    }

    @Test (priority = 20)
    public void userCanOpenNewWindow(){
       browserWindowsPage.clickOnNewWindowButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");
    }

    @Test (priority = 30)
    public void userCanOpenNewMessageWindow(){
        browserWindowsPage.clickOnNewWindowMessageButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/browser-windows");
    }







}

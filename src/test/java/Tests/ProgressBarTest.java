package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.ProgressBarPage;
import Pages.WidgetsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBarTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        widgetsPage= new WidgetsPage();
        progressBarPage = new ProgressBarPage();
    }

    @Test
    public void userCanControlProgressBar() throws InterruptedException {
        homePage.clickOnCard("Widgets");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        widgetsPage.selectWidget("Progress Bar");
        progressBarPage.clickOnStartStop();
        Thread.sleep(3000);
        progressBarPage.clickOnStartStop();
        Thread.sleep(2000);
        progressBarPage.clickOnStartStop();
        Thread.sleep(2000);
        progressBarPage.clickOnStartStop();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/progress-bar");
    }
}

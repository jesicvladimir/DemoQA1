package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.LinksPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LinksTest extends BaseTest{

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        elementsPage = new ElementsPage();
        linksPage = new LinksPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnLinks();


    }


    @Test (priority = 10)
    public void userCanOpenNewTabByClickingOnHomeLink(){
        linksPage.clickOnHomeButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    @Test (priority = 20)
    public void userCanOpenNewTabByClickingOnHome2Link(){
        linksPage.clickOnHomeButton2();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    @Test (priority = 30)
    public void userCanClickOnAPICallLinks(){
        linksPage.clickOnCreated();
        linksPage.clickOnNoContent();
        linksPage.clickOnMoved();
        linksPage.clickOnBadRequest();
        linksPage.clickOnUnauthorized();
        linksPage.clickOnForbidden();
        linksPage.clickOnNotFound();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
        Assert.assertEquals(linksPage.linkResponse.getText(), "Link has responded with staus 404 and status text Not Found");


    }
}

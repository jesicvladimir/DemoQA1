package Tests;

import Base.BaseTest;
import Pages.AlertsFrameWindowsPage;
import Pages.HomePage;
import Pages.ModalDialogsPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ModalDialogsTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        alertsFrameWindowsPage = new AlertsFrameWindowsPage();
        modalDialogsPage = new ModalDialogsPage();
        homePage.clickOnCard("Alerts, Frame & Windows");
        alertsFrameWindowsPage.clickOnItem("Modal Dialogs");

    }


    @Test (priority = 10)
    public void userCanOpenSmallModal()  {
        modalDialogsPage.clickOnSmallModal();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/modal-dialogs");
        Assert.assertEquals(modalDialogsPage.textSmallModal.getText(), "Small Modal");
        Assert.assertEquals(modalDialogsPage.modalBodytext.getText(),"This is a small modal. It has very less content");

    }

    @Test (priority = 20)
    public void userCanOpenLargeModal()  {
        modalDialogsPage.clickOnLargeModal();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/modal-dialogs");
        Assert.assertEquals(modalDialogsPage.largeModaltext.getText(), "Large Modal");
        Assert.assertEquals(modalDialogsPage.largeModalBodyText.getText(),"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

    }

    @Test (priority = 30)
    public void userCanCloseSmallModal() throws InterruptedException {
        modalDialogsPage.clickOnSmallModal();
        Thread.sleep(3000);
        modalDialogsPage.closeSmall();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/modal-dialogs");

    }

    @Test (priority = 40)
    public void userCanCloseLargeModal() throws InterruptedException {
        modalDialogsPage.clickOnLargeModal();
        Thread.sleep(3000);
        modalDialogsPage.closeLarge();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/modal-dialogs");

    }



}

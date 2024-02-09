package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class WebTablesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage();
        elementsPage = new ElementsPage();
        webTablesPage = new WebTablesPage();
        homePage.clickOnCard("Elements");
        elementsPage.clickOnWebTables();


    }

    @Test (priority=10)
    public void userCanFillTable() {
        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Frank");
        webTablesPage.inputLastName("Lampard");
        webTablesPage.inputAge("45");
        webTablesPage.inputEmail1("lampard@example.com");
        webTablesPage.inputSalary("200000");
        webTablesPage.inputDepartment("CMF");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("John");
        webTablesPage.inputLastName("Terry");
        webTablesPage.inputAge("43");
        webTablesPage.inputEmail1("terry@example.com");
        webTablesPage.inputSalary("200000");
        webTablesPage.inputDepartment("CB");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Petr");
        webTablesPage.inputLastName("Cech");
        webTablesPage.inputAge("41");
        webTablesPage.inputEmail1("cech@example.com");
        webTablesPage.inputSalary("200000");
        webTablesPage.inputDepartment("GK");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Branislav");
        webTablesPage.inputLastName("Ivanovic");
        webTablesPage.inputAge("39");
        webTablesPage.inputEmail1("ivanovic@example.com");
        webTablesPage.inputSalary("150000");
        webTablesPage.inputDepartment("RB");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Ashley");
        webTablesPage.inputLastName("Cole");
        webTablesPage.inputAge("43");
        webTablesPage.inputEmail1("cole@example.com");
        webTablesPage.inputSalary("120000");
        webTablesPage.inputDepartment("LB");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Didier");
        webTablesPage.inputLastName("Drogba");
        webTablesPage.inputAge("45");
        webTablesPage.inputEmail1("drogba@example.com");
        webTablesPage.inputSalary("250000");
        webTablesPage.inputDepartment("CF");
        webTablesPage.clickOnSubmit();

        webTablesPage.clickOnAddButton();
        webTablesPage.inputFirstName("Florent");
        webTablesPage.inputLastName("Malouda");
        webTablesPage.inputAge("43");
        webTablesPage.inputEmail1("malouda@example.com");
        webTablesPage.inputSalary("100000");
        webTablesPage.inputDepartment("LMF");
        webTablesPage.clickOnSubmit();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
        Assert.assertTrue(webTablesPage.fullTable.isDisplayed());
        }

        @Test (priority = 20)
        public void userCanDeleteRows(){

            webTablesPage.clickOnAddButton();
            webTablesPage.inputFirstName("Frank");
            webTablesPage.inputLastName("Lampard");
            webTablesPage.inputAge("45");
            webTablesPage.inputEmail1("lampard@example.com");
            webTablesPage.inputSalary("200000");
            webTablesPage.inputDepartment("CMF");
            webTablesPage.clickOnSubmit();

            webTablesPage.clickOnAddButton();
            webTablesPage.inputFirstName("John");
            webTablesPage.inputLastName("Terry");
            webTablesPage.inputAge("43");
            webTablesPage.inputEmail1("terry@example.com");
            webTablesPage.inputSalary("200000");
            webTablesPage.inputDepartment("CB");
            webTablesPage.clickOnSubmit();

            webTablesPage.clickOnAddButton();
            webTablesPage.inputFirstName("Petr");
            webTablesPage.inputLastName("Cech");
            webTablesPage.inputAge("41");
            webTablesPage.inputEmail1("cech@example.com");
            webTablesPage.inputSalary("200000");
            webTablesPage.inputDepartment("GK");
            webTablesPage.clickOnSubmit();

            webTablesPage.deleteElements();

            Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
            Assert.assertTrue(webTablesPage.fullTable.isDisplayed());

        }


    }

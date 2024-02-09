package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BaseTest {
    public RadioButtonPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id= "yesRadio")
    public WebElement yes;

    @FindBy(id= "impressiveRadio")
    public WebElement impressive;

    @FindBy(className = "mt-3")
    public WebElement selectedAnswer;

    public void clickOnYes(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", yes);
    }

    public void clickOnImpressive(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("arguments[0].click();", impressive);

    }
}

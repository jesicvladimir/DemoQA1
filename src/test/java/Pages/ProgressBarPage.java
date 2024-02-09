package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage extends BaseTest {
    public ProgressBarPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="startStopButton")
    public WebElement startStop;

    public void clickOnStartStop(){
        startStop.click();
    }
}

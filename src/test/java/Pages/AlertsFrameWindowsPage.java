package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertsFrameWindowsPage extends BaseTest {

    JavascriptExecutor js = (JavascriptExecutor)driver;

    public AlertsFrameWindowsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".btn.btn-light ")
    public List<WebElement> cards2;

    @FindBy(className = "text")
    public List<WebElement> cardItems;



   public void clickOnItem(String str){
        for(int i =0; i<cardItems.size();i++) {
            if (cardItems.get(i).getText().equals(str)) {
                js.executeScript("arguments[0].click();", cardItems.get(i));
            }
        }
    }


    public void clickOnAlertsFrameWindowsCard(String text2){
        for(int i =0; i< cards2.size(); i++){
            if (cards2.get(i).getText().equals(text2)){
                cards2.get(i).click();
            }

        }
    }



}






package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ButtonsPage extends BaseTest {
    public ButtonsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(id="doubleClickMessage")
    public WebElement doubleClickMessage;
    @FindBy(id="rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id="dynamicClickMessage")
    public WebElement dynamicClickMessage;

    @FindBy(css=".btn.btn-primary")
    public List<WebElement> buttons;


    public void clickOnButton(String text5){
        for(int i =0; i< buttons.size(); i++){
            if (buttons.get(i).getText().equals(text5)){
                buttons.get(i).click();
            }

        }
    }


    }




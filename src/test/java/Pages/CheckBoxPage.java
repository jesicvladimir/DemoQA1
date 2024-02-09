package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BaseTest {
    public CheckBoxPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(css=".rct-icon.rct-icon-expand-all")
    public WebElement plus;

    @FindBy(css=".rct-icon.rct-icon-collapse-all")
    public WebElement minus;

    @FindBy(id="result")
    public WebElement youHaveSelected;

    @FindBy(className="rct-title")
    public List<WebElement> check;


    public void selectOption(String text3){
        for(int i =0; i< check.size(); i++){
            if (check.get(i).getText().equals(text3)){
                check.get(i).click();
            }

        }
    }


    public void clickOnPlus(){
        plus.click();
    }

    public void clickOnMinus(){
        minus.click();
    }


}

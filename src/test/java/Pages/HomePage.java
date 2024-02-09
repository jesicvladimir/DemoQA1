package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends BaseTest {

    public HomePage(){
        PageFactory.initElements(driver, this );
    }

    @FindBy(css = ".card.mt-4.top-card")
    public List<WebElement> cards;

    public void clickOnCard(String text){
        for(int i =0; i< cards.size(); i++){
            if (cards.get(i).getText().equals(text)){
                cards.get(i).click();
            }

        }
    }

}

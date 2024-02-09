package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WidgetsPage extends BaseTest {
    public WidgetsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".btn.btn-light ")
    public List<WebElement> widgets;

    public void selectWidget(String text4){
        for(int i =0; i< widgets.size(); i++){
            if (widgets.get(i).getText().equals(text4)){
               widgets.get(i).click();
            }

        }
    }

    }


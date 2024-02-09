package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsPage extends BaseTest {
    public FormsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".btn.btn-light ")
    public List<WebElement> practiceForm;
    public void clickOnPF(String text){
        for(int i =0; i< practiceForm.size(); i++){
            if (practiceForm.get(i).getText().equals(text)){
                practiceForm.get(i).click();
            }

        }
    }

}

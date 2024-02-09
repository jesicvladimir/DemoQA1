package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BaseTest {

    public ElementsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy( id="item-0" )
      public WebElement textBox;

    @FindBy(id ="item-1")
    public WebElement checkBox;

    @FindBy(id="item-2")
    public WebElement radioButton;

    @FindBy(id = "item-3")
    public WebElement webTables;

    @FindBy(id="item-4")
    public WebElement buttons;

    @FindBy(id="item-5")
    public WebElement links;

    public void clickOnTextBox(){
        textBox.click();
    }

    public void clickOnCheckBox(){
        checkBox.click();
    }

    public void clickOnWebTables(){
        webTables.click();
    }

    public void clickOnButtons(){
        buttons.click();
    }

    public void clickOnLinks(){
        links.click();
    }

    public void clickOnRadioButton(){
        radioButton.click();
    }

}

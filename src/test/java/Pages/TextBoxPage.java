package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseTest {
    public TextBoxPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id="userEmail")
    public WebElement email;

    @FindBy(id="currentAddress")
    public WebElement currentAddress;

    @FindBy(id="permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id="submit")
    public WebElement submitButton;

    @FindBy (id ="output")
    public WebElement textBoxForm;




    public void inputFullName(){
        fullName.sendKeys("Nicolas Anelka");
    }

    public void inputEmail(){
        email.sendKeys("anelka@example.com");
    }

    public void inputCurrentAddress(){
        currentAddress.sendKeys("15th Street");
    }

    public void inputPermanentAddress(){
        permanentAddress.sendKeys("8th Street");
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }


}

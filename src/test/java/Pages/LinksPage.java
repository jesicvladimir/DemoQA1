package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage extends BaseTest {
    public LinksPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "simpleLink")
    public WebElement homeButton;

    @FindBy(id="created")
    public WebElement createdButton;
    @FindBy(id="dynamicLink")
    public WebElement homeButton2;

    @FindBy(id="no-content")
    public WebElement noContent;
    @FindBy(id="moved")
    public WebElement moved;
    @FindBy(id="bad-request")
    public WebElement badRequest;
    @FindBy(id="unauthorized")
    public WebElement unauthorized;
    @FindBy(id="forbidden")
    public WebElement forbidden;
    @FindBy(id="invalid-url")
    public WebElement notFound;
    @FindBy(id="linkResponse")
    public WebElement linkResponse;

    public void clickOnHomeButton(){
        homeButton.click();
    }

    public void clickOnCreated(){
        createdButton.click();
    }

    public void clickOnHomeButton2(){
        homeButton2.click();
    }
    public void clickOnNoContent(){
        noContent.click();
    }
    public void clickOnMoved(){
       moved.click();
    }
    public void clickOnBadRequest(){
        badRequest.click();
    }
    public void clickOnUnauthorized(){
        unauthorized.click();
    }
    public void clickOnForbidden(){
        forbidden.click();
    }
    public void clickOnNotFound(){
        notFound.click();
    }

}

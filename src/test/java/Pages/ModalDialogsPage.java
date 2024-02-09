package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModalDialogsPage extends BaseTest {

    public ModalDialogsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "showSmallModal")
    public WebElement smallModal;

    @FindBy(id = "showLargeModal")
    public WebElement largeModal;

    @FindBy(id = "closeSmallModal")
    public WebElement closeSmallModal;

    @FindBy(id = "closeLargeModal")
    public WebElement closeLargeModal;

    @FindBy(id = "example-modal-sizes-title-sm")
    public WebElement textSmallModal;

    @FindBy(className = "modal-body")
    public WebElement modalBodytext;

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement largeModaltext;

    @FindBy(className = "modal-body")
    public WebElement largeModalBodyText;


    public void clickOnSmallModal() {
        smallModal.click();
    }

    public void clickOnLargeModal() {
        largeModal.click();
    }

    public void closeSmall() {
        closeSmallModal.click();
    }

    public void closeLarge() {
        closeLargeModal.click();
    }


}

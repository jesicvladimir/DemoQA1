package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;
    public ExcelReader excelReader;
    public HomePage homePage;

    public ElementsPage elementsPage;

    public TextBoxPage textBoxPage;

    public CheckBoxPage checkBoxPage;

    public WebTablesPage webTablesPage;

    public ButtonsPage buttonsPage;
    public LinksPage linksPage;

    public FormsPage formsPage;
    public PracticeFormPage practiceFormPage;
    public AlertsFrameWindowsPage alertsFrameWindowsPage;
    public BrowserWindowsPage browserWindowsPage;
    public ModalDialogsPage modalDialogsPage;
    public WidgetsPage widgetsPage;
    public ProgressBarPage progressBarPage;
    public RadioButtonPage radioButtonPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();


    }

}

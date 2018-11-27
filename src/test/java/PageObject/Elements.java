package PageObject;

import Utilities.BeforeAndAfter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Utilities;

public class Elements extends BeforeAndAfter {


    @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
    private WebElement FileUpload;


    public Elements(WebDriver browser) {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }
}

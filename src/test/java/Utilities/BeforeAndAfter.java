package Utilities;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeforeAndAfter {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

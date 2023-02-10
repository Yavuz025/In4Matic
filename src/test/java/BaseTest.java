import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass

    public void setup() {
        driver = createDriver();
        driver.manage().window().maximize();

    }

    private WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(1000);

        driver.close();
        driver.quit();


    }
}

//    @Parameters("browser")
//    public void setup(String browser) throws Exception{
//        //Check if parameter passed from TestNG is 'firefox'
//        if(browser.equalsIgnoreCase("firefox")){
//            //create firefox instance
//            System.setProperty("webdriver.gecko.driver", "C:/Users/yavuz/OneDrive/Belgeler/geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        //Check if parameter passed as 'chrome'
//        else if(browser.equalsIgnoreCase("chrome")){
//            //set path to chromedriver.exe
//            System.setProperty("webdriver.chrome.driver","C:/Users/yavuz/OneDrive/Belgeler/chromedriver.exe");
//            //create chrome instance
//            driver = new ChromeDriver();
//        }
//        //Check if parameter passed as 'Edge'
//        else if(browser.equalsIgnoreCase("Edge")){
//            //set path to Edge.exe
//            System.setProperty("webdriver.edge.driver","C:/Users/yavuz/OneDrive/Belgeler/msedgedriver.exe");
//            //create Edge instance
//            driver = new EdgeDriver();
//        }
//        else{
//            //If no browser passed throw exception
//            throw new Exception("Browser is not correct");
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }




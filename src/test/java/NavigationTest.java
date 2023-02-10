
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class NavigationTest extends BaseTest {


    @BeforeClass
    public void main() {
        HomePage mainPage = new HomePage(driver);
        mainPage.goToWebsite();
        mainPage.acceptAll();
       assertEquals("https://i4m.be/",driver.getCurrentUrl());
    }


    @Test
    public void MainPageButtons() {


        HomePage mainPageButtons = new HomePage(driver);

        mainPageButtons.ClickLogo();
        assertEquals("https://i4m.be/",driver.getCurrentUrl());

        mainPageButtons.ClickAbout();
        assertEquals("https://i4m.be/about/",driver.getCurrentUrl());

        mainPageButtons.ClickClients();
        assertEquals("https://i4m.be/clients/",driver.getCurrentUrl());

        mainPageButtons.ClickCareer();
        assertEquals("https://i4m.be/careers/",driver.getCurrentUrl());

        mainPageButtons.ClickContact();
        assertEquals("https://i4m.be/contact/",driver.getCurrentUrl());


        //  mainPageButtons.SelectLanguage();


}
    @Test
    public void SelectLanguage() throws InterruptedException {
        HomePage mainPageButtons = new HomePage(driver);
        WebElement img = driver.findElement(By.xpath("//a[@title=('EN')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        Thread.sleep(3000);
        mainPageButtons.selectedDutch();
        assertEquals("https://i4m.be/nl/",driver.getCurrentUrl());
    }
@Test
    public void ContactUs(){
    HomePage mainPageButtons = new HomePage(driver);
    //mainPageButtons.ClickLogo();
    mainPageButtons.ClickContactUs();
    assertEquals("https://i4m.be/contact/",driver.getCurrentUrl());
    }
@Test
    public void Company(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    HomePage mainPageButtons = new HomePage(driver);
    mainPageButtons.Company();
    assertEquals("https://i4m.be/clients/",driver.getCurrentUrl());


}
    @Test
    public void Candidate(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        HomePage mainPageButtons = new HomePage(driver);
        mainPageButtons.Candidate();
        assertEquals("https://i4m.be/careers/",driver.getCurrentUrl());


   }

    @Test
    public void MainPageFooterButtons() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,999)", "");

        HomePage mainPageFooterButtons = new HomePage(driver);

        mainPageFooterButtons.ClickFooterAbout();
        assertEquals("https://i4m.be/about/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterClients();
        assertEquals("https://i4m.be/clients/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterCareer();
        assertEquals("https://i4m.be/careers/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterContact();
        assertEquals("https://i4m.be/contact/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterHome();
        assertEquals("https://i4m.be/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterPrivacy();
        assertEquals("https://i4m.be/privacy/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterTermsOfService();
        assertEquals("https://i4m.be/terms-of-service/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterCookiePolicy();
        assertEquals("https://i4m.be/cookie-policy-eu/",driver.getCurrentUrl());

        mainPageFooterButtons.ClickFooterFindItJobs();
        assertEquals("https://job.i4m.be/",driver.getCurrentUrl());

    }
}
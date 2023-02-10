
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class SearchResultsTest extends BaseTest {

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        SearchResults search = new SearchResults(driver);
        Thread.sleep(3000);
        search.goToWebsite();
        search.ClickSave();
    }

    @Test
    public void MatchCriteria() {
        SearchResults search = new SearchResults(driver);



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");

        search.region();
        search.function();
        // search.vacancy();
        assertEquals("https://job.i4m.be/index.php/page/advsearchvacs/bb/1/command/dispresults/noredirectdetail/1", driver.getCurrentUrl());


    }

    @Test
    public void JobAlerts() throws InterruptedException {

        SearchResults jobAlerts = new SearchResults(driver);


        jobAlerts.clickJobAlerts();

        jobAlerts.clickRegion();
        Thread.sleep(3000);
        jobAlerts.clickFunction();
        jobAlerts.email();
        Thread.sleep(3000);
        String security = driver.findElement(By.className("error")).getText();
        assertEquals("Invalid security code.", security);


    }

    @Test
    public void JobApplicationWithLogin() throws InterruptedException {
        SearchResults search = new SearchResults(driver);



        search.applyWithLogin();


    }
    @Test
    public void JobApplicationWithCv() throws InterruptedException {
        SearchResults search = new SearchResults(driver);




        search.applyWithCv();

        String errorMessage=driver.findElement(By.xpath("//div[@class=('error')]")).getText();
        assertEquals("There are errors or missing data in the form submitted. Please correct.",errorMessage);


    }

    @Test
    public void JobApplicationCallMeBack() throws InterruptedException {
        SearchResults search = new SearchResults(driver);


        search.callMeBack();


    }

    @Test
    public void JobApplicationCallMeBackEmptyBoxes() throws InterruptedException {
        SearchResults search = new SearchResults(driver);




        search.callMeBackEmptyBoxes();

        String callMeBack = driver.findElement(By.className("error")).getText();

        assertEquals("Whoops, there are errors or missing data in the form submitted. Please correct.", callMeBack);

    }

    @Test
    public void RandomJobApp() {
        SearchResults search = new SearchResults(driver);


        search.randomJobApp();


    }
}

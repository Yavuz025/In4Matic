
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class JobsTest extends BaseTest {

    @BeforeClass
    public void main() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.goToWebsite();
        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SpontaneousApplication() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();
        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(img).perform();
        jobsPage.spontaneousApplication();

        WebElement wb = driver.findElement(By.xpath("//h1[@class=('title aplTitle aplEnrollTitle')]"));
        String text = wb.getText();
        assertEquals("Sign up", text);


    }

    @Test
    public void SignUp() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();

        jobsPage.spontaneousApplication();

        WebElement wb = driver.findElement(By.xpath("//h1[@class=('title aplTitle aplEnrollTitle')]"));
        String text = wb.getText();
        assertEquals("Sign up", text);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        JobsPage jobsPage2 = new JobsPage(driver);

        //jobsPage2.FillInTheForm();
    }

    @Test
    public void useMyCVToFillInTheForm() throws InterruptedException {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        Thread.sleep(5000);
        jobsPage.SignUpWithCvLoad();

    }

    @Test
    public void OurServicesTraining() {
        JobsPage ourServices = new JobsPage(driver);
        ourServices.OnOurServices();
        ourServices.ClickSave();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        ourServices.ClickTraining();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void OurServicesJuniors() {
        JobsPage ourServices = new JobsPage(driver);
        ourServices.OnOurServices();
        ourServices.ClickSave();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();


        ourServices.ClickJuniors();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void OurServicesInternship() {
        JobsPage ourServices = new JobsPage(driver);
        ourServices.OnOurServices();
        ourServices.ClickSave();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();

        ourServices.ClickInternships();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());


    }

    @Test
    public void OurServicesFreelanceGuidance() {
        JobsPage ourServices = new JobsPage(driver);
        ourServices.OnOurServices();
        ourServices.ClickSave();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();

        ourServices.ClickFreelanceGuidance();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void OurServicesAdvice() {
        JobsPage ourServices = new JobsPage(driver);
        ourServices.OnOurServices();
        ourServices.ClickSave();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();


        ourServices.ClickAdvice();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void LoginWithInvalidUsernameAndInvalidPassword() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();

        jobsPage.ClickLoginWithInvalidUsernameAndPassword();

        String getNotification = driver.findElement(By.xpath("//div[@class=('error aplError aplStartError')]")).getText();

        assertEquals("Acces denied.", getNotification);
    }

    @Test
    public void LoginWithoutUsernameAndPassword() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithoutUsernameAndPassword();

        String getNotification2 = driver.findElement(By.xpath("//div[@class=('error aplError aplStartError')]")).getText();

        assertEquals("Please fill in an e-mail adres as well as a password.", getNotification2);


    }


    @Test
    public void LoginWithValidUsernameAndPassword() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithValidUsernameAndPassword();

        //String getNotification2 = driver.findElement(By.xpath("//div[@class=('error aplError aplStartError')]")).getText();

        assertEquals("https://job.i4m.be/index.php/page/applicants/bb/1", driver.getCurrentUrl());


    }

    @Test
    public void LoginWithInvalidUsernameAndPassword() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithInValidUsernameAndPassword();

        String getNotification = driver.findElement(By.xpath("//div[@class=('error aplError aplStartError')]")).getText();

        assertEquals("Acces denied.", getNotification);

    }

    @Test
    public void LoginWithValidUsernameAndInValidPassword() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithValidUsernameAndInValidPassword();

        String getNotification = driver.findElement(By.xpath("//div[@class=('error aplError aplStartError')]")).getText();

        assertEquals("Acces denied.", getNotification);

    }

    @Test
    public void ForgetMyPassword() throws InterruptedException {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithInvalidUsernameAndPassword();
        jobsPage.ForgetMyPassword();

        Thread.sleep(6000);
        assertEquals("https://job.i4m.be/index.php/page/applicants/bb/1/command/startlogin", driver.getCurrentUrl());

    }

    @Test
    public void ForgetMyPasswordWithInvalidEmail() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        jobsPage.ClickLoginWithInvalidUsernameAndPassword();
        jobsPage.ForgetMyPasswordWithInvalidEmail();

        String getNotification = driver.findElement(By.xpath("//div[@class=('error aplError aplStartErrorFpwd')]")).getText();

        assertEquals("There is no user registered with this e-mail address / username.", getNotification);

    }

    @Test
    public void SignUpWithCvFile() throws InterruptedException {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();

        WebElement img = driver.findElement(By.xpath("//a[@title=('Jobs')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,999)", "");


        jobsPage.SignUpWithCv();

    }

    @Test
    public void OurWork() {

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();
        WebElement img = driver.findElement(By.xpath("(//a[@title=('Our work')])[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();

        jobsPage.ClickOnOurWork();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void Blog() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.ClickJobs();
        jobsPage.ClickBlog();
        assertEquals("https://i4m.be/#blog", driver.getCurrentUrl());


    }
    @Test
    public void FooterJobs() {
        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.ClickSave();
        jobsPage.footerJobs();


        assertEquals("https://job.i4m.be/index.php/page/sitemap/bb/1/cms_categorie/26167", driver.getCurrentUrl());


    }
}
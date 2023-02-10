
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SitemapTest extends BaseTest{

    @BeforeClass
    public void before() {
        Sitemap map = new Sitemap(driver);
        map.goToSitemap();
        map.ClickSave();
        assertEquals("https://job.i4m.be/index.php/page/sitemap/bb/1/cms_categorie/26167", driver.getCurrentUrl());
    }

    @Test
    public void SitemapHome1() {
        Sitemap map = new Sitemap(driver);

        map.homeButton1InSitemap();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void SitemapHome2() {

        Sitemap map = new Sitemap(driver);

        map.homeButton2InSitemap();
        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapAbout1() {
        Sitemap map = new Sitemap(driver);

        map.aboutButton1InSitemap();
        assertEquals("https://i4m.be/about/", driver.getCurrentUrl());

    }

    @Test
    public void SitemapAbout2() {
        Sitemap map = new Sitemap(driver);

        map.aboutButton2InSitemap();
        assertEquals("https://i4m.be/about/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJob1() {
        Sitemap map = new Sitemap(driver);

        map.jobButton1InSitemap();
        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void SitemapJob2() throws InterruptedException {
        Sitemap map = new Sitemap(driver);

        map.jobButton2InSitemap();
        Thread.sleep(3000);
        WebElement wb = driver.findElement(By.xpath("//div[@class=('col-xs-12')]//h1"));
        String text = wb.getText();

        assertEquals("Jobs", text);
    }

    @Test
    public void SitemapJobSpontaneousApplication() throws InterruptedException {
        Sitemap map = new Sitemap(driver);

        map.jobSpontaneousApplicationInSitemap();

        WebElement wb = driver.findElement(By.xpath("//h1[@class=('title aplTitle aplEnrollTitle')]"));
        String text = wb.getText();

        assertEquals("Sign up", text);
    }

    @Test
    public void SitemapJobLogin() throws InterruptedException {
        Sitemap map = new Sitemap(driver);

        map.jobLoginInSitemap();

        WebElement wb = driver.findElement(By.xpath("//h1[@class=('title aplTitle aplStartTitle')]"));
        String text = wb.getText();

        assertEquals("Applicant login", text);
    }

    @Test
    public void SitemapJobOurServices() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesInSitemap();


        assertEquals("https://i4m.be/#", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurServicesTraining() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesTrainingInSitemap();


        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurServicesJuniors() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesJuniorsInSitemap();


        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurServicesInternships() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesInternshipsInSitemap();


        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurServicesFreelanceGuidance() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesFreelanceGuidanceInSitemap();


        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurServicesAdvice() {
        Sitemap map = new Sitemap(driver);

        map.jobOurServicesAdviceInSitemap();


        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapJobOurWork() {
        Sitemap map = new Sitemap(driver);

        map.jobOurWorkInSitemap();

        WebElement wb = driver.findElement(By.xpath("(//div[@class=('col-xs-12')])[1]"));
        String text = wb.getText();

        assertEquals("Our work", text);


    }

    @Test
    public void SitemapJobOurWorkCustomers() {
        Sitemap map = new Sitemap(driver);

        map.jobOurWorkCustomersInSitemap();

        assertEquals("https://i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SitemapContact1() {
        Sitemap map = new Sitemap(driver);

        map.contact1InSitemap();

        assertEquals("https://i4m.be/#contact", driver.getCurrentUrl());
    }

    @Test
    public void SitemapContact2() {
        Sitemap map = new Sitemap(driver);

        map.contact2InSitemap();

        assertEquals("https://i4m.be/#contact", driver.getCurrentUrl());
    }

    @Test
    public void SitemapBlog() {
        Sitemap map = new Sitemap(driver);

        map.blogInSitemap();

        assertEquals("https://i4m.be/#blog", driver.getCurrentUrl());
    }

    @Test
    public void SitemapPrivacy() {
        Sitemap map = new Sitemap(driver);

        map.privacyInSitemap();

        assertEquals("https://i4m.be/privacy/", driver.getCurrentUrl());
    }
}

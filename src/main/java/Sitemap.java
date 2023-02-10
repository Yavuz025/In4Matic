import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sitemap {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://job.i4m.be/index.php/page/sitemap/bb/1/cms_categorie/26167";


    public Sitemap(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToSitemap() {
        driver.navigate().to(url);
    }

    public void ClickSave() {

        driver.findElement(By.xpath("//input[@value=('Save')]")).click();
    }

    public void homeButton1InSitemap() {
        driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();


    }


    public void homeButton2InSitemap() {


        driver.findElement(By.xpath("(//li[@class=('mainLev')])[1]")).click();
    }

    public void aboutButton1InSitemap() {
        driver.findElement(By.xpath("(//a[text()='About'])[1]")).click();


    }


    public void aboutButton2InSitemap() {


        driver.findElement(By.xpath("(//li[@class=('mainLev')])[2]")).click();
    }

    public void jobButton1InSitemap() {
        driver.findElement(By.xpath("(//a[text()='Jobs'])[1]")).click();


    }


    public void jobButton2InSitemap() {


        driver.findElement(By.xpath("(//li[@class=('Smp1')])[10]//a")).click();
    }

    public void jobSpontaneousApplicationInSitemap() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Spontaneous application'])[3]")));


        driver.findElement(By.xpath("(//a[text()='Spontaneous application'])[3]")).click();
    }

    public void jobLoginInSitemap() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Login'])[3]")));


        driver.findElement(By.xpath("(//a[text()='Login'])[3]")).click();
    }

    public void jobOurServicesInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Our services'])[3]")).click();
    }

    public void jobOurServicesTrainingInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Training'])[3]")).click();
    }

    public void jobOurServicesJuniorsInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Juniors'])[3]")).click();

    }

    public void jobOurServicesInternshipsInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Internships'])[3]")).click();
    }

    public void jobOurServicesFreelanceGuidanceInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Freelance guidance'])[3]")).click();
    }

    public void jobOurServicesAdviceInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Advice'])[3]")).click();
    }

    public void jobOurWorkInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Our work'])[3]")).click();
    }

    public void jobOurWorkCustomersInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Customers'])[3]")).click();
    }


    public void contact1InSitemap() {
        driver.findElement(By.xpath("(//a[text()='Contact'])[3]")).click();
    }

    public void contact2InSitemap() {
        driver.findElement(By.xpath("(//li[@class=('Smp1')])[12]//a")).click();
    }

    public void blogInSitemap() {
        driver.findElement(By.xpath("(//a[text()='Blog'])[3]")).click();
    }

    public void privacyInSitemap() {
        driver.findElement(By.xpath("(//li[@class=('Smp1')])[11]//a")).click();
    }
}

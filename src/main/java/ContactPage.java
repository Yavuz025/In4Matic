import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {


    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://i4m.be/contact/";
    private By AcceptAll=By.xpath("//a[@aria-label='Accept all']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void goToWebsite() {
        driver.navigate().to(url);
    }

    public void acceptAll() {
        driver.findElement(AcceptAll).click();
    }

    public void FillInTheContactForm() {
        driver.findElement(By.name("your-name")).sendKeys("Informatic");
        driver.findElement(By.name("your-email")).sendKeys("Informatic@mail.com");
        driver.findElement(By.name("your-subject")).sendKeys("Softaware Tester");
        driver.findElement(By.name("your-message")).sendKeys("I need a job");
        driver.findElement(By.name("your-consent")).click();
        driver.findElement(By.xpath("//input[@value=('Send')]")).click();

    }
    public void FillInTheContactFormWithoutRequired() throws InterruptedException {
        driver.findElement(By.name("your-name")).sendKeys("");
        driver.findElement(By.name("your-email")).sendKeys("Informati@mail.com");
        driver.findElement(By.name("your-subject")).sendKeys("Softaware Tester");
        driver.findElement(By.name("your-message")).sendKeys("I need a job");

        driver.findElement(By.name("your-consent")).click();
        driver.findElement(By.xpath("//input[@value=('Send')]")).click();
        Thread.sleep(3000);

    }


    public void FillInTheContactFormWithInvalidEmail() throws InterruptedException {
        driver.findElement(By.name("your-name")).sendKeys("Nobody");
        driver.findElement(By.name("your-email")).sendKeys("Informaticmail.com");
        driver.findElement(By.name("your-subject")).sendKeys("Softaware Tester");
        driver.findElement(By.name("your-message")).sendKeys("I need a job");

        driver.findElement(By.name("your-consent")).click();
        driver.findElement(By.xpath("//input[@value=('Send')]")).click();
        Thread.sleep(3000);
    }
}

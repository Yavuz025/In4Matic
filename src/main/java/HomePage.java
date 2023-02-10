import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://i4m.be";

    private final By logo = By.xpath("//img[@alt=('In4Matic - Find your IT job')]");
    private By AcceptAll = By.xpath("//a[@aria-label='Accept all']");

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void goToWebsite() {
        driver.navigate().to(url);
    }

    public void ClickLogo() {
        driver.findElement(logo).click();
    }

    public void acceptAll() {
        driver.findElement(AcceptAll).click();
    }

    public void ClickAbout() {
        driver.findElement(By.xpath("//a[@title=('About')]")).click();
    }

    public void ClickClients() {
        driver.findElement(By.xpath("//a[@title=('Clients')]")).click();
    }

    public void ClickCareer() {
        driver.findElement(By.xpath("//a[@title=('Career')]")).click();
    }


    public void ClickContact() {
        driver.findElement(By.xpath("//a[@title=('Contact')]")).click();
    }

    public void ClickContactUs() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=('/contact')]")));
        driver.findElement(By.xpath("//a[@href=('/contact')]")).click();

    }

    public void Company() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=('1470399594_Web_Design.png')]")));

        driver.findElement(By.xpath("//img[@title=('1470399594_Web_Design.png')]")).click();
    }

    public void Candidate() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=('1470399674_App_Development.png')]")));

        driver.findElement(By.xpath("//img[@title=('1470399674_App_Development.png')]")).click();

    }


    public void CheckingInfoEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=('mailto:info@i4m.be')]")));
        driver.findElement(By.xpath("//a[@href=('mailto:info@i4m.be')]")).click();

    }

    public void ClickFooterAbout() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-3172\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-3172\"]/a")).click();

    }

    public void ClickFooterClients() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-3173\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-3173\"]/a")).click();

    }

    public void ClickFooterCareer() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-3174\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-3174\"]/a")).click();

    }

    public void ClickFooterContact() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-3175\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-3175\"]/a")).click();

    }

    public void ClickFooterHome() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home']")));
        driver.findElement(By.xpath("//a[text()='Home']")).click();

    }

    public void ClickFooterPrivacy() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Privacy Policy']")));


        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();

    }

    public void ClickFooterTermsOfService() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Terms of Service']")));
        driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();

    }

    public void ClickFooterCookiePolicy() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cookie Policy (EU)']")));
        driver.findElement(By.xpath("//a[text()='Cookie Policy (EU)']")).click();

    }

    public void ClickFooterFindItJobs() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Find IT Jobs']")));
        driver.findElement(By.xpath("//a[text()='Find IT Jobs']")).click();

    }

    public void selectedDutch() {
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=('NL')]")));
        driver.findElement(By.xpath("//a[@title=('NL')]")).click();


    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://i4m.be/clients/";
    private By AcceptAll=By.xpath("//a[@aria-label='Accept all']");

    public ClientsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void goToWebsite() {
        driver.navigate().to(url);
    }

    public void acceptAll() {
        driver.findElement(AcceptAll).click();
    }

    public void scheduleQMeeting() {
        driver.findElement(By.xpath("//span[text()='Schedule a meeting']")).click();

    }
}

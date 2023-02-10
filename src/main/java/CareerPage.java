import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://i4m.be/career/";
    private By AcceptAll=By.xpath("//a[@aria-label='Accept all']");

    public CareerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }


    public void goToWebsite() {
        driver.navigate().to(url);
    }

    public void acceptAll() {
        driver.findElement(AcceptAll).click();
    }

    public void visitOurPortal() {

        driver.findElement(By.xpath("(//span[text()='Visit our career portal'])[1]")).click();


    }

    public void supportEngineer() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[1]")));
        driver.findElement(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[1]")).click();
    }

    public void dotNetDeveloper() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[2]")));
        driver.findElement(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[2]")).click();
    }

    public void projectManager() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()=' Project Manager']")));
        driver.findElement(By.xpath("//h3[text()=' Project Manager']")).click();
        driver.getWindowHandles();

    }

    public void systemEngineer() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[4]")));
        driver.findElement(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[4]")).click();
    }

    public void functionalBusinessAnalyst() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[5]")));
        driver.findElement(By.xpath("(//div[@class=('elementskit-infobox text- text- icon-lef-right-aligin elementor-animation-   ')])[5]")).click();
    }
}

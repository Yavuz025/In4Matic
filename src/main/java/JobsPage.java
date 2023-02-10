import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class JobsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String url = "https://job.i4m.be/";
    private WebElement[] options;


    public JobsPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void goToWebsite() {

        driver.navigate().to(url);
    }

    public void ClickSave() {

        driver.findElement(By.xpath("//input[@value=('Save')]")).click();
    }

    public void ClickJobs() {


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=('Jobs')]")));
        driver.findElement(By.xpath("//a[@title=('Jobs')]"));
    }

    public void spontaneousApplication() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class=('subLevel_1')])[1]")));
        driver.findElement(By.xpath("(//li[@class=('subLevel_1')])[1]")).click();

    }

    public void OnOurServices() {

        driver.findElement(By.xpath("(//a[@title=('Our services')])[1]"));
    }

    public void ClickTraining() {

        driver.findElement(By.xpath("(//a[@target=('_self')])[3]")).click();
    }

    public void ClickJuniors() {
        driver.findElement(By.xpath("(//a[@target=('_self')])[4]")).click();
    }

    public void ClickInternships() {
        driver.findElement(By.xpath("(//a[@target=('_self')])[5]")).click();
    }

    public void ClickFreelanceGuidance() {
        driver.findElement(By.xpath("(//a[@target=('_self')])[6]")).click();
    }

    public void ClickAdvice() {
        driver.findElement(By.xpath("(//a[@target=('_self')])[7]")).click();
    }

    public void SignUpWithCvLoad() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class=('subLevel_1')])[1]")));
        driver.findElement(By.xpath("(//li[@class=('subLevel_1')])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Use my CV to fill in the form']")));
        driver.findElement(By.xpath("//a[text()='Use my CV to fill in the form']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(By.name("ApplbSignUp")).click();

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=('file')]")));
//        driver.findElement(By.xpath("//input[@type=('file')]")).click();
        //sendKeys("C:/Users/yavuz/Downloads/CV NL I4M.docx/");
    }

    public void FillInTheForm() {
        driver.findElement(By.id("QEID_1246891")).sendKeys("Name1");
        driver.findElement(By.id("QEID_1246892")).sendKeys("name2");
        driver.findElement(By.xpath("//div[@data=('1')]")).click();


        driver.findElement(By.id("QEID_1246894")).sendKeys("email@mail.com");
        driver.findElement(By.id("QEID_1246895")).sendKeys("Post");
        driver.findElement(By.id("QEID_1246896")).sendKeys("phone 12345");
        driver.findElement(By.id("Q_1246898_Y")).click();
        driver.findElement(By.id("QEID_1246899")).click();
        Select select = new Select(driver.findElement(By.id("QEID_1246899")));
        select.selectByVisibleText("Payroll");


        driver.findElement(By.xpath("//div[@data=('5')]")).click();
        driver.findElement(By.xpath("//div[@data=('6')]")).click();

    }

    public void ClickLoginWithInvalidUsernameAndPassword() {

        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("emailaddress")).sendKeys("info@i4m.be");
        driver.findElement(By.id("userpassword")).sendKeys("+32 9 237 26 40");
        driver.findElement(By.name("bApplLogin")).click();


    }

    public void ClickLoginWithoutUsernameAndPassword() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("emailaddress")).sendKeys("");
        driver.findElement(By.id("userpassword")).sendKeys("");
        driver.findElement(By.name("bApplLogin")).click();
    }

    public void ClickLoginWithValidUsernameAndPassword() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("emailaddress")).sendKeys("yavuzs25@hotmail.com");
        driver.findElement(By.id("userpassword")).sendKeys("one23456789");
        driver.findElement(By.name("bApplLogin")).click();

    }

    public void ClickLoginWithInValidUsernameAndPassword() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("emailaddress")).sendKeys("yavuzs25hotmail.com");
        driver.findElement(By.id("userpassword")).sendKeys("one23456789");
        driver.findElement(By.name("bApplLogin")).click();
    }

    public void ClickLoginWithValidUsernameAndInValidPassword() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("emailaddress")).sendKeys("yavuzs25@hotmail.com");
        driver.findElement(By.id("userpassword")).sendKeys("123456789");
        driver.findElement(By.name("bApplLogin")).click();

    }

    public void ForgetMyPassword() {
        driver.findElement(By.id("emailaddress_fp")).sendKeys("yavuzs25@hotmail.com");
        driver.findElement(By.name("MailPassword")).click();

    }

    public void ForgetMyPasswordWithInvalidEmail() {
        driver.findElement(By.id("emailaddress_fp")).sendKeys("yavuzs25hotmail.com");
        driver.findElement(By.name("MailPassword")).click();
    }

    public void SignUpWithCv() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();

        driver.findElement(By.xpath("//input[@type=('file')]")).sendKeys("C:/Users/yavuz/Downloads/CV NL I4M.docx");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,999)", "");


        driver.findElement(By.name("ApplbSignUp")).click();
    }


    public void ClickOnOurWork() {
        driver.findElement(By.xpath("(//a[@title=('Our work')])[1]"));
        driver.findElement(By.xpath("(//a[text()='Customers'])[1]")).click();
    }

    public void ClickBlog() {
        driver.findElement(By.xpath("(//a[@title=('Blog')])[1]")).click();
    }

    public void footerJobs() {

        driver.findElement(By.xpath("(//a[@title=('Jobs')])[3]")).click();


    }
}

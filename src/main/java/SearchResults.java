import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SearchResults {

    private WebDriver driver;
    private WebDriverWait wait;
    //String[] regions = {"Oost-Vlaanderen", "West-Vlaanderen", "Brussel", "Vlaams Brabant", "Antwerpen", "Luik", "Waals Brabant"};
    private String url = "https://job.i4m.be/";

    public SearchResults(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToWebsite() {
        driver.navigate().to(url);
    }

    public void ClickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=('Save')]")));

        driver.findElement(By.xpath("//input[@value=('Save')]")).click();
    }

    public void region() {


        List<WebElement> regions = driver.findElements(By.xpath("//div[@id=('facet_regio')]//li"));
        Random rand = new Random();
        WebElement randomElement = regions.get(rand.nextInt(regions.size()));
        randomElement.click();
        System.out.println("Total regions :" + regions.size());
    }

    public void function() {
        List<WebElement> functions = driver.findElements(By.xpath("//div[@id=('facet_functiegr')]//li"));
        Random rand = new Random();
        WebElement randomElement = functions.get(rand.nextInt(functions.size()));
        randomElement.click();

        System.out.println("Total functions :" + functions.size());

    }
    //    public void vacancy() {
//
//        List<WebElement> vacancies = driver.findElements(By.xpath("//div[@id=('facet_categorie')]//li"));
//        Random rand = new Random();
//        WebElement randomElement = vacancies.get(rand.nextInt(vacancies.size()));
//        randomElement.click();
//        System.out.println("Total vacancies :" + vacancies.size());
//    }

    public void clickJobAlerts() {
        driver.findElement(By.id("jobalert")).click();


    }


    public void clickRegion() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('select multiple search_disabled')])[1]")));
        driver.findElement(By.xpath("(//div[@class=('select multiple search_disabled')])[1]")).click();
        List<WebElement> regions = driver.findElements(By.xpath("(//div[@class=('select_options')])[2]//div"));
        System.out.println(regions.size());
        Random rand = new Random();
        WebElement randomElement = regions.get(rand.nextInt(regions.size()));
        randomElement.click();
        Random rand1 = new Random();
        WebElement randomElement1 = regions.get(rand1.nextInt(regions.size()));
        randomElement1.click();

        driver.findElement(By.xpath("//h2[text()='Job search agent']")).click();
    }

    public void clickFunction() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=('select multiple search_disabled')])[2]")));
        driver.findElement(By.xpath("(//div[@class=('select multiple search_disabled')])[2]")).click();
        List<WebElement> functions = driver.findElements(By.xpath("(//div[@class=('select_options')])[3]//div"));
        System.out.println(functions.size());
        Random rand = new Random();
        WebElement randomElement = functions.get(rand.nextInt(functions.size()));
        randomElement.click();
        Random rand1 = new Random();
        WebElement randomElement1 = functions.get(rand1.nextInt(functions.size()));
        randomElement1.click();
        driver.findElement(By.xpath("//h2[text()='Job search agent']")).click();
    }

    public void email() {
        driver.findElement(By.name("sq_email")).sendKeys("info@i4m.be");

        driver.findElement(By.name("bSubmit")).click();
    }

    public void applyWithLogin() {
        List<WebElement> options = driver.findElements(By.xpath("//div[@class=('actSResContainer')]//div//h3//a"));
        System.out.println(options.size());
        Random rand = new Random();
        WebElement randomElement = options.get(rand.nextInt(options.size()));
        randomElement.click();
        //System.out.println(randomElement.getText());
        driver.findElement(By.xpath("(//input[@class=('button jbdButton jbdButApl')])[2]")).click();

        driver.findElement(By.id("emailaddress")).sendKeys("yavuzs25@hotmail.com");
        driver.findElement(By.id("userpassword")).sendKeys("tudrumof");
        driver.findElement(By.xpath("//input[@value=('Login and apply')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1550)", "");

        //driver.findElement(By.name("sSubmit")).click();
    }
    public void applyWithCv() {

        List<WebElement> options = driver.findElements(By.xpath("//div[@class=('actSResContainer')]//div//h3//a"));
        System.out.println(options.size());
        Random rand = new Random();
        WebElement randomElement = options.get(rand.nextInt(options.size()));
        randomElement.click();
        driver.findElement(By.xpath("(//input[@name=('Button4')])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("cv_file")));
//        driver.findElement(By.id("cv_file")).sendKeys("C:/Users/yavuz/Downloads/CV NL I4M.docx");


        driver.findElement(By.xpath("//div[@class=('selected_item')]")).click();

        WebElement img = driver.findElement(By.xpath("//div[@class=('selected_item')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Dutch']")));
        driver.findElement(By.xpath("//div[text()='Dutch']")).click();
        driver.findElement(By.name("bApplSignUp")).click();


        driver.findElement(By.id("QEID_1246891")).sendKeys("Nobody");
        driver.findElement(By.id("QEID_1246892")).sendKeys("Everybody");
        driver.findElement(By.id("QEID_1246894")).sendKeys("yavuzs25@hotmail.com");
        driver.findElement(By.id("Q_1246898_Y")).click();
        driver.findElement(By.name("sSubmit")).click();






    }

    public void callMeBack() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        List<WebElement> links = driver.findElements(By.xpath("//div[@class=('pageNav actPageNav')]//a"));

        System.out.println(links.size());

        for (WebElement header : links) {
            System.out.println(header.getText());
        }
        Random rand = new Random();
        WebElement randomElement = links.get(rand.nextInt(links.size()));
        randomElement.click();
        List<WebElement> options = driver.findElements(By.xpath("//div[@class=('actSResContainer')]//div//h3//a"));
        System.out.println(options.size());
        Random rand1 = new Random();
        WebElement randomElement1 = options.get(rand1.nextInt(options.size()));
        randomElement1.click();

        driver.findElement(By.id("QEID_7145")).sendKeys("Name");
        driver.findElement(By.id("QEID_7146")).sendKeys("Phone");
        //driver.findElement(By.name("sSubmit")).click();

    }

    public void callMeBackEmptyBoxes() {
        List<WebElement> options = driver.findElements(By.xpath("//div[@class=('actSResContainer')]//div//h3//a"));
        System.out.println(options.size());
        Random rand = new Random();
        WebElement randomElement = options.get(rand.nextInt(options.size()));
        randomElement.click();

        driver.findElement(By.id("QEID_7145")).sendKeys("");
        driver.findElement(By.id("QEID_7146")).sendKeys("Phone");
        driver.findElement(By.name("sSubmit")).click();
    }


    public void randomJobApp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        List<WebElement> links = driver.findElements(By.xpath("//div[@class=('pageNav actPageNav')]//a"));

        System.out.println(links.size());

        for (WebElement header : links) {
            System.out.println(header.getText());
        }
        Random rand = new Random();
        WebElement randomElement = links.get(rand.nextInt(links.size()));
        randomElement.click();
        List<WebElement> options = driver.findElements(By.xpath("//div[@class=('actSResContainer')]//div//h3//a"));
        System.out.println(options.size());
        Random rand1 = new Random();
        WebElement randomElement1 = options.get(rand1.nextInt(options.size()));
        randomElement1.click();

    }
}

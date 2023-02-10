
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;


import static org.testng.Assert.assertEquals;

public class CareerPageTest extends BaseTest {


    @BeforeClass
    public void before() {
        CareerPage career = new CareerPage(driver);
        career.goToWebsite();
        career.acceptAll();
    }

    @Test
    public void JoinUs() {
        CareerPage career = new CareerPage(driver);
        career.visitOurPortal();

        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());
    }

    @Test
    public void SupportEngineer() {
        CareerPage career = new CareerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        career.supportEngineer();
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
            }

        }

        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());


    }

    @Test
    public void dotNetDeveloper() {
        CareerPage career = new CareerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        career.dotNetDeveloper();
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
            }

        }

        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void ProjectManager() {
        CareerPage career = new CareerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");

        career.projectManager();
        // driver.switchTo().window("2");
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
            }

        }

        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());

    }

    @Test
    public void SystemEngineer() {
        CareerPage career = new CareerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        career.systemEngineer();

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
            }

        }
        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());


    }

    @Test
    public void functionalBusinessAnalyst() {
        CareerPage career = new CareerPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        career.functionalBusinessAnalyst();
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!currentWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
            }

        }

        assertEquals("https://job.i4m.be/", driver.getCurrentUrl());


    }
}

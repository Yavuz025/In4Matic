
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ContactPageTest extends BaseTest {



    @BeforeClass
    public void beforeClass() throws InterruptedException {

        ContactPage contact = new ContactPage(driver);
        contact.goToWebsite();
        contact.acceptAll();
        Thread.sleep(3000);
    }
    @Test
    public void fillInTheContactInfo() {
        ContactPage contact = new ContactPage(driver);

        assertEquals("https://i4m.be/contact/",driver.getCurrentUrl());
        contact.FillInTheContactForm();

        WebElement wb = driver.findElement(By.xpath("//input[@type=('submit')]"));
        assertTrue(wb.isDisplayed());
    }

    @Test
    public void fillInTheContactInfoWithoutMandatoryFilled() throws InterruptedException {
        ContactPage contact = new ContactPage(driver);

        contact.FillInTheContactFormWithoutRequired();
        WebElement wb = driver.findElement(By.xpath("(//span[text()='The field is required.'])[1]"));

        assertEquals("The field is required.",wb.getText());
    }

    @Test
    public void fillInTheContactInfoWithInvalidEmail() throws InterruptedException {
        ContactPage contact = new ContactPage(driver);

        contact.FillInTheContactFormWithInvalidEmail();

        WebElement wb = driver.findElement(By.xpath("(//span[text()='The e-mail address entered is invalid.'])[1]"));
        String text = wb.getText();

        assertEquals("The e-mail address entered is invalid.",text);
    }


}

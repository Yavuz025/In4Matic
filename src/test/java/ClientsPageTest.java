import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

import static org.testng.Assert.assertEquals;

public class ClientsPageTest extends BaseTest  {

    @Test
    public void ScheduleAMeeting() {

        ClientsPage clients=new ClientsPage(driver);
        clients.goToWebsite();
        clients.acceptAll();
        clients.scheduleQMeeting();
        assertEquals("https://i4m.be/contact/",driver.getCurrentUrl());




    }


}

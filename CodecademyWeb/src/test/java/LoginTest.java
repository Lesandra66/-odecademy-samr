import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {


    @Test
    public void LoginTest() throws InterruptedException {
        clickOnLoginButton();
        fillUserForm("alexandramarush6@gmail.com", "Kspjxrf1996");
        confirmLoginButton();
        pause();


        //driver.findElement(By.name("presentation")).click();
        //driver.findElement(By.id("user_submit")).click();

    }


}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("https://www.codecademy.com/");
    }

    public void pause() throws InterruptedException {
        Thread.sleep(4000);
    }

    public void confirmLoginButton() {
        click(By.id("user_submit"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void fillUserForm(String login, String pwrd) {
        driver.findElement(By.name("user[login]")).sendKeys(login);
        driver.findElement(By.name("user[password]")).sendKeys(pwrd);
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("[href=\'/login?redirect=%2F\']"));
    }

    @AfterClass
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.quit();
    }
}

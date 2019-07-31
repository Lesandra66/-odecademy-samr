import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindInfoTest extends TestBase {
    @Test
    public void infoFindingTest() throws InterruptedException {
        clickOnLoginButton();
        fillUserForm("alexandramarush6@gmail.com", "Kspjxrf1996");
        confirmLoginButton();
        pause();


        clickOnSearchIconOnHeader();
        //fillSearchBarForm();
        chooseInPopularSearch();

    }

    private void chooseInPopularSearch() {
        click((By.xpath("//button[contains(text(),'Data Science')]")));
    }

    private void clickOnSearchIconOnHeader() {
        click((By.cssSelector("#header-search")));
        //click((By.xpath("//input[@id='header-search-bar']")));


    }

}

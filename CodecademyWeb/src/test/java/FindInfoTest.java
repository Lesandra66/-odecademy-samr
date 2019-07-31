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
        chooseInPopularSearch();
        clickStartPage();
        openPageMyCourses();
        addCareerPath();

    }

    private void clickStartPage() {
        click((By.cssSelector("#logo")));
        click((By.xpath("//a[@id='logo']")));

    }

    private void addCareerPath() {
        click((By.xpath("//a[@class='editLink__3E6qLVKWi2Ws_H_J-Z7K8F']")));
        click((By.cssSelector(".editLink__3E6qLVKWi2Ws_H_J-Z7K8F")));
    }

    private void openPageMyCourses() {
        click((By.cssSelector(".#004963459309724594-1")));
        //click((By.xpath("//a[@id='004963459309724594-1']")));
    }

    private void chooseInPopularSearch() {
        click((By.xpath("//button[contains(text(),'Data Science')]")));
    }

    private void clickOnSearchIconOnHeader() {
        click((By.cssSelector("#header-search")));
        click((By.xpath("//input[@id='header-search-bar']")));


    }

}

package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import tests.consulting.pages.YoutubePage;
import tests.consulting.utilities.BrowserUtils;
import tests.consulting.utilities.ConfigurationReader;
import tests.consulting.utilities.Driver;

public class YoutubeStepDefs {
    YoutubePage youtubePage = new YoutubePage();

    @Given("the user on the Youtube main page")
    public void the_user_on_the_Youtube_main_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user clicks {string}")
    public void the_user_clicks(String string) {

        BrowserUtils.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("scrollBy(0,250)");
        BrowserUtils.waitFor(2);
        youtubePage.acceptAll.click();
        BrowserUtils.waitFor(2);
        youtubePage.search.sendKeys("sevda cicegi");
        youtubePage.searchButton.click();
        BrowserUtils.waitFor(2);
        youtubePage.sevdaCicegi.click();
    }

    @Then("the user should be able to listen this music")
    public void the_user_should_be_able_to_listen_this_music() {

        BrowserUtils.waitFor(2);
        String actualTitle =Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(actualTitle.contains("mor ve ötesi"));


}
}
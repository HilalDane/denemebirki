package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import tests.consulting.pages.BasePage;
import tests.consulting.pages.LoginPage;
import tests.consulting.utilities.BrowserUtils;
import tests.consulting.utilities.ConfigurationReader;
import tests.consulting.utilities.Driver;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("user hover over Karriere button")
    public void user_hover_over_Karriere_button() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        Thread.sleep(2000);
        actions.moveToElement(loginPage.karriere).perform();

    }

    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {

        String str = loginPage.testEng.getText();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(str.contains(string));

    }

    @When("the user clicks Kontakt button")
    public void the_user_clicks_Kontakt_button() {
       loginPage.kontakt.click();
       BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to see KONTAKTIEREN SIE UNS")
    public void the_user_should_be_able_to_see_KONTAKTIEREN_SIE_UNS() {

        Assert.assertTrue(loginPage.getKontakt.getText().contains("KONTAKTIEREN SIE UNS"));
    }

    @Then("the user drags the page down")
    public void the_user_drags_the_page_down() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("scrollBy(0,250)");
    }

    @Then("the user should be able to see kontaktperson is Imad")
    public void the_user_should_be_able_to_see_kontaktperson_is_Imad() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(loginPage.kontaktperson.getText().contains("Imad"));
    }



}

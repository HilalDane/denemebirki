package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tests.consulting.pages.KontaktPage;
import tests.consulting.pages.LoginPage;
import tests.consulting.utilities.BrowserUtils;
import tests.consulting.utilities.Driver;

public class KontaktStepDef {
    KontaktPage kontaktPage = new KontaktPage();
    LoginPage loginPage = new LoginPage();

    @When("the user clicks Jetzt Anfragen button")
    public void theUserClicksJetztAnfragenButton() {

        kontaktPage.scrollDown2();

        BrowserUtils.waitFor(2);

        kontaktPage.scrollDown();
        BrowserUtils.waitFor(2);
       // JavascriptExecutor js = (JavascriptExecutor) Driver.get();

     //   WebElement element = Driver.get().findElement(By.id("id_of_element"));
     //   ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", kontaktPage.jetztanfragen);

       /* Actions actions = new Actions(Driver.get());
        actions.moveToElement(kontaktPage.jetztanfragen);
        actions.perform();
        BrowserUtils.waitFor(2);*/
        kontaktPage.scrollDown();
        kontaktPage.scrollDown();
        kontaktPage.jetztanfragen.click();

    }

    @Then("the user should be on the kontakt page")
    public void the_user_should_be_on_the_kontakt_page() {

        String actualtitle = Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        String expectedtitle = "Kontakt – TestConsulting";

        Assert.assertEquals(actualtitle,expectedtitle);

    }

    @When("the user clicks Kontaktt button")
    public void the_user_clicks_Kontaktt_button() {

        kontaktPage.scrollDown2();

        BrowserUtils.waitFor(2);

        kontaktPage.scrollDown();
        BrowserUtils.waitFor(2);

        kontaktPage.scrollDown();
        kontaktPage.scrollDown();
        kontaktPage.kontakt.click();

    }

    @When("the user clicks Fragen button")
    public void the_user_clicks_Fragen_button() {

        kontaktPage.scrollDown2();

        BrowserUtils.waitFor(2);

        kontaktPage.scrollDown();
        BrowserUtils.waitFor(2);

        kontaktPage.scrollDown();
        kontaktPage.scrollDown();
        kontaktPage.fragen.click();





    }

    @When("the user fill the empty fields")
    public void the_user_fill_the_empty_fields() {

        kontaktPage.name.sendKeys("Hilal");
        kontaktPage.nachname.sendKeys("Birdane");
        kontaktPage.email.sendKeys("hilal.birdane@icloud.com");
        kontaktPage.handy.sendKeys("12345");
        BrowserUtils.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("scrollBy(0,200)");
        kontaktPage.betreff.sendKeys("xx");
        kontaktPage.nachricht.sendKeys("it is not important");
        BrowserUtils.waitFor(2);
        kontaktPage.senden.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to send Emaill")
    public void the_user_should_be_able_to_send_Emaill() {

       kontaktPage.nachrichtfürdank.isDisplayed();

    }

    @When("the user clicks Kontakt button")
    public void the_user_clicks_Kontakt_button() {
        BrowserUtils.waitFor(2);
        loginPage.kontakt.click();
        BrowserUtils.waitFor(2);
    }


}

package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tests.consulting.pages.KontaktPage;
import tests.consulting.pages.LoginPage;
import tests.consulting.utilities.BrowserUtils;

public class EmailStepDef  {
    LoginPage loginPage= new LoginPage();

    @When("the user fill the empty field")
    public void the_user_fill_the_empty_field() {
       loginPage.scrollDown();
        loginPage.name.sendKeys("Hilal");
        BrowserUtils.waitFor(2);
        loginPage.email.sendKeys("hilal.birdane@icloud.com");
       BrowserUtils.waitFor(2);
        loginPage.rufNummer.sendKeys("12345");
       BrowserUtils.waitFor(2);
        loginPage.betreff.sendKeys("xx");
       BrowserUtils.waitFor(2);
        loginPage.nachricht.sendKeys("its not important");
       BrowserUtils.waitFor(2);
        loginPage.senden.click();

    }

    @When("the user click the Senden button")
    public void the_user_click_the_button() {
        BrowserUtils.waitFor(2);
        loginPage.senden.click();
    }

    @Then("the user should be able to send Email")
    public void the_user_should_be_able_to_send_Email() {

        BrowserUtils.waitFor(2);
        Assert.assertTrue(loginPage.dankNachricht.isDisplayed());

    }


}

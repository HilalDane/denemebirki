package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tests.consulting.pages.KarrierePage;
import tests.consulting.utilities.BrowserUtils;
import tests.consulting.utilities.Driver;

public class KarriereStepDef {

    KarrierePage karrierePage = new KarrierePage();

    @When("the user cliks Karriere button")
    public void the_user_cliks_Karriere_button() {
        BrowserUtils.waitFor(2);
        karrierePage.karriere.click();
        BrowserUtils.waitFor(2);
        karrierePage.scrollDown3();
    }

    @When("the user clicks each {string}")
    public void the_user_clicks_each(String string) {

        BrowserUtils.waitFor(2);
        karrierePage.scrollDown();
        new KarrierePage().button(string).click();
        BrowserUtils.waitFor(2);
    }

  /*  @Then("the titel should be same with titel")
    public void the_titel_should_be_same_with_titel() {


        System.out.println(Driver.get().getTitle());
    }*/

    @Then("the titel should be same with each {string}")
    public void the_titel_should_be_same_with_each(String string) {
        BrowserUtils.waitFor(2);
     String expectedTitle=   new KarrierePage().button(string).getText();
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));


    }



}

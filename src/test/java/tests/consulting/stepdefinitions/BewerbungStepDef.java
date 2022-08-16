package tests.consulting.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.consulting.pages.KarrierePage;

public class BewerbungStepDef {

    KarrierePage karrierePage = new KarrierePage();
    @When("the user fill  the empty field")
    public void the_user_fill_the_empty_field() {
     karrierePage.bewerbung();

    }

    @Then("the user should be able to send apply")
    public void the_user_should_be_able_to_send_apply() {

    }

}

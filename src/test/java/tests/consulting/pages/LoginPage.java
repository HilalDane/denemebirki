package tests.consulting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a/span[text()='Karriere']")
    public WebElement karriere;

    @FindBy(xpath = "//a/span[contains(text(),'Test Automation Engineer')]")
    public WebElement testEng;

    @FindBy(xpath = "//a/span[text()='Kontakt']")
    public WebElement kontakt;

    @FindBy(xpath = "//div/h2[text()='Kontaktieren Sie uns']")
    public WebElement getKontakt;

    @FindBy(xpath = "//h3[@class='team-member-name']")
    public WebElement kontaktperson;

}

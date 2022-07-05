package tests.consulting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;


public class LoginPage extends BasePage{

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


    @FindBy(name = "avia_1_1")
    public WebElement name;

    @FindBy(name = "avia_2_1")
    public WebElement email;

    @FindBy(name = "avia_3_1")
    public WebElement rufNummer;

    @FindBy(name = "avia_4_1")
    public WebElement betreff;


    @FindBy(name = "avia_5_1")
    public WebElement nachricht;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement senden;

    @FindBy(xpath = "//h3[text()='Vielen Dank für Ihre Nachricht. Wir melden uns bei Ihnen']")
    public WebElement dankNachricht;

}

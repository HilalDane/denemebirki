package tests.consulting.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.consulting.utilities.Driver;

public  abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    } //bunu yapmadan driveri calistiramam

    @FindBy(xpath = "//a/span[text()='Karriere']")
    public WebElement karriere;

    @FindBy(xpath = "//a/span[text()='Test Automation Engineer (m/w/d)'")
    public WebElement testEng;

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

    @FindBy(className = "button")
    public WebElement senden;

    @FindBy(xpath = "//tr/td/b/a")
    public WebElement titel;

    @FindBy(xpath = "//a/span[text()='Dienstleistungen']")
    public WebElement dienstleistungen;

    @FindBy(xpath = "//a/span[text()='Kontakt']")
    public WebElement kontakt;

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("scrollBy(0,250)");
    }

    public void scrollDown2(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("scrollBy(0,1500)");
    }




}

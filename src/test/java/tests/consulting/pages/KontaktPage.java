package tests.consulting.pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;

public class KontaktPage extends BasePage {

    public KontaktPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "avia_1_1")
    public WebElement name;

    @FindBy(name = "avia_2_1")
    public WebElement email;

    @FindBy(name = "avia_3_1")
    public WebElement rufNummer;

    @FindBy(name = "avia_4_1")
    public WebElement handy;


    @FindBy(name = "avia_5_1")
    public WebElement betreff;

    @FindBy(name = "avia_6_1")
    public WebElement nachricht;

    @FindBy(className = "button")
    public WebElement senden;

}

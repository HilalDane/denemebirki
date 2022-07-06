package tests.consulting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;

public class KarrierePage extends BasePage {

    public KarrierePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//tr/td/b/a")
    public WebElement titel;

    @FindBy(xpath = "(//tr/td/b/a)[1]")
    public WebElement tae;
    @FindBy(xpath = "(//tr/td/b/a)[2]")
    public WebElement tm;
    @FindBy(xpath = "(//tr/td/b/a)[3]")
    public WebElement atadsc;
    @FindBy(xpath = "(//tr/td/b/a)[4]")
    public WebElement markhr;
    @FindBy(xpath = "(//tr/td/b/a)[5]")
    public WebElement werkstudent;
    @FindBy(xpath = "(//tr/td/b/a)[6]")
    public WebElement testeng;

    @FindBy(xpath = "(//div/form/p/span[1]/input)[1]")
    public WebElement vornachname;

    @FindBy(xpath = "(//div/form/p/span/input)[2]")
    public WebElement ihreEmail;

    @FindBy(xpath = "(//div/form/p/span/input)[3]")
    public WebElement kundigungsfrist;

    @FindBy(xpath = "//select/option")
    public WebElement select;

    @FindBy(xpath = "//textarea[@placeholder='Ihre Nachricht*']")
    public WebElement ihreNachricht;

    @FindBy(xpath ="(//div/form/p/span[1]/input)[2]")
    public WebElement chooseFile;

    @FindBy(xpath = "//input[@value='Senden']")
    public WebElement sendenn;

    public WebElement button(String buttonText){
        return Driver.get().findElement(By.xpath("//a[text()='"+buttonText+"']"));
    }



}

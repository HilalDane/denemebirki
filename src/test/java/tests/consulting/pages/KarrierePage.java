package tests.consulting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.consulting.utilities.BrowserUtils;
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

    @FindBy(name="Anhang")
    public WebElement chooseFile;

    @FindBy(xpath = "//input[@value='Senden']")
    public WebElement sendenn;

    public WebElement button(String buttonText){
      //  return Driver.get().findElement(By.xpath("//a[text()='"+buttonText+"']"));

        return Driver.get().findElement(By.linkText(buttonText));


    }

    public void bewerbung(){
        scrollDown2();
        scrollDown();
        vornachname.sendKeys("xx xx ");
        ihreEmail.sendKeys("xx");
        kundigungsfrist.sendKeys("xx");
        select.click();
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//select/option[2]")).click();
        scrollDown();
        BrowserUtils.waitFor(2);
        ihreNachricht.sendKeys("its not important");
        scrollDown();
        scrollDown();
        BrowserUtils.waitFor(2);
       Actions actions = new Actions(Driver.get());
       WebElement element = Driver.get().findElement(By.name("Anhang"));
       actions.moveToElement(element).click().perform();
         //chooseFile.click();
         BrowserUtils.waitFor(2);
      // chooseFile.sendKeys("/test/Desktop/forchoosefile.pdf" + Keys.ENTER);
      //  actions.sendKeys(element,"/test/Desktop/forchoosefile.pdf"+ Keys.ENTER);
        BrowserUtils.waitFor(2);
        sendenn.click();

    }



}

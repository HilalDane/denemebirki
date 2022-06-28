package tests.consulting.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  abstract class BasePage {

    @FindBy(xpath = "//a/span[text()='Karriere']")
    public WebElement karriere;

    @FindBy(xpath = "//a/span[text()='Test Automation Engineer (m/w/d)'")
    public WebElement testEng;

}

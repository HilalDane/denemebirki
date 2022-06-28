package tests.consulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;

public class YoutubePage {

    public YoutubePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (partialLinkText = "Sevda Çiçeği")
    public WebElement sevdaCicegi;

    @FindBy (xpath = "//yt-formatted-string[text()='Accept all']")
    public WebElement acceptAll;

    @FindBy(name="search_query")
    public WebElement search;

    @FindBy(id="search-icon-legacy")
    public WebElement searchButton;
}

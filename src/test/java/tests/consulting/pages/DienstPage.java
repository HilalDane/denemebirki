package tests.consulting.pages;

import org.openqa.selenium.support.PageFactory;
import tests.consulting.utilities.Driver;

public class DienstPage extends BasePage{

    public DienstPage(){
        PageFactory.initElements(Driver.get(), this);
    }



}

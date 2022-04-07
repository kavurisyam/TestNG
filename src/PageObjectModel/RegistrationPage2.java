package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {

    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "REGISTER")
    WebElement RegLink;

    @FindBy(name = "firstName")
    WebElement FirstName;

    @FindBy(name = "lastName")
    WebElement LastName;

/*
1.Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns.
2.In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
3.@FindBy: An annotation used in Page Factory to locate and declare web elements using different locators.
 */

    RegistrationPage2(WebDriver d){
        driver = d;


        PageFactory.initElements(d,this);
    }

    public void clickRegLink(){
        RegLink.click();
    }

    public void setFirstName(String fname){
        FirstName.sendKeys(fname);
    }

    public void setLastName(String lname){
        LastName.sendKeys(lname);
    }

}

package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
POM:  1.Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all
      web elements.
      2.It is useful in reducing code duplication and improves test case maintenance.
 */

public class RegistrationPage {

    WebDriver driver;

    By RegLink = By.linkText("REGISTER");
    By FirstName = By.name("firstName");
    By LastName = By.name("lastName");

    RegistrationPage(WebDriver d){
        //this.driver=driver;
        driver=d;
    }

    public void clickRegLink(){

        driver.findElement(RegLink).click();
    }
    public  void  setFirstName(String name){

        driver.findElement(FirstName).sendKeys(name);
    }
    public void setLastName(String lname){
        driver.findElement(LastName).sendKeys(lname);
    }


}

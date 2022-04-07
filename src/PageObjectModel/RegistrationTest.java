package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {

    @Test
    public  void verifyFlightReg(){
        System.setProperty("webdriver.chrome.driver", "D:/Softwares/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");

        RegistrationPage RG = new RegistrationPage(driver);
        //RegistrationPage2 RG2 = new RegistrationPage2(driver);

        RG.clickRegLink();
        RG.setFirstName("sam");
        RG.setLastName("kavuri");

//        RG2.clickRegLink();
//        RG2.setFirstName("sam");
//        RG2.setLastName("kavuri");


        /* validation: If we provide all the details  to Register account. At the end of the program we can write below code
                       to check whether our account has been registered or not.
        */
        if(driver.getPageSource().contains("Thank you for registering")){
            System.out.println("You are registered successfully TEST PASSED");
        }
        else{
            System.out.println("Your registration failed TEST FAILED");
        }

        driver.close();



    }
}

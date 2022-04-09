import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Git {

        @Test
        public void gold(){
            System.out.println("This is gold class");

        }
        @Test
        public void silver(){
            System.out.println("This is silver class");
        }
        @Test
        public void handleCalender(){
            System.setProperty("webdriver.chrome.driver","D:/Softwares/Selenium/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
            driver.manage().window().maximize();

            driver.findElement(By.id("datepicker")).click();

            String monthAndYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

            System.out.println(monthAndYear);

            // Below method is one way to print the date and year separately

        /*String [] arr = monthAndYear.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);*/

            //Another way

            String month = monthAndYear.split(" ")[0];
            String year = monthAndYear.split(" ")[1];
            System.out.println(month);
            System.out.println(year);



            while(!(month.equalsIgnoreCase("June") && year.equalsIgnoreCase("2025"))){

                driver.findElement(By.xpath("//span[text()='Next']")).click();  //If we want to click on past dates just change the date and instead of 'Next' we can give the 'Prev' as per the Xpath

                monthAndYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();

                month = monthAndYear.split(" ")[0];

                year = monthAndYear.split(" ")[1];

            }
            driver.findElement(By.xpath("//a[text()='10']")).click();

            System.out.println("Selected month is:" +month);
            System.out.println("Selected Year is:"  +year);



        }
    @Test
    public  void metal(){
        System.out.println("This is metal");
    }


    }


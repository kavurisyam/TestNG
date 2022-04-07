package CrossBrowsers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC1 {
	
	@BeforeClass          //This before class method will execute one time before starting the class
	void BeforeClass() {
		System.out.println("This will execute before class....");
	}
	
	@AfterClass           //This after class method will execute one time after completion of the class
	void afterClass() {
		System.out.println("This will execute after class..");
	}
	
	
	@BeforeMethod         //This wil execute before every method execute
	void beforeMethod() {
		System.out.println("This will execute before every method");
	}
	
	@AfterMethod         // This will execute after every method execute
	void AfterMethod() {
		System.out.println("This will execute after every method");
	}
	
	
	
	
	@Test
	void test1() {
		System.out.println("This is test 1....");
	}
	
	@Test
	void test2() {
		System.out.println("This is test 2....");
	}
	
	
	@BeforeTest         // This before we can create either TC1 or TC2
	void beforeTest() {
		System.out.println("This will execute before test...");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("This will execute after test...");
	}

}

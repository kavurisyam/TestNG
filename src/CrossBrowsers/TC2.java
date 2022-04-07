package CrossBrowsers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC2 {
	
	
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
		void test3() {
			System.out.println("This is test 3....");
		}
		
		@Test
		void test4() {
			System.out.println("This is test 4....");
		}
		
		@BeforeSuite         //This BeforeSuite and AfterSuite also we can creat either in the TC1 or TC2
		void beforeSuite() {
			System.out.println("This will execute before the Test Suite...");
		}
		
		@AfterSuite
		void afterSuite() {
			System.out.println("This will execute after the Test suite..");
		}


	}


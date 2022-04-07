package CrossBrowsers;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=0)   // we can give the any number as priority ex: 20, 30, 50,70..... 
	void testOne() {
		System.out.println("This is test1");
	}
	
	@Test(priority=1)
	void testTwo() {
		System.out.println("This is test2");
	}
	
	@Test(priority=2)
	void testThree() {
		System.out.println("This is test3");
	}
	
	@Test(priority=3, enabled=false)  // If we giv enabled= false this will not be execute in the run time
	void testFour() {
		System.out.println("This is test4");
	}
	
	// O/P printed as This is test4 1,3,2 because it will follow the alphabetical order

}

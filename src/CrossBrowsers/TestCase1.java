package CrossBrowsers;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test(priority=1)   //If we give priority it will execute in sequential order
	void setup() {
		System.out.println("hi");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("hello");  //In O/P this one executed first inorder to execute in sequential order we have to pass the "Priority"
	}
	
	@Test(priority=3)
	void teardown() {
		System.out.println("how are you");
		
	}

}

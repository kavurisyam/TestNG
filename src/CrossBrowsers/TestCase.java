/*what is @Test: We used the @Test annotation. @Test is used to tell that the method under it is a test case. 
                 In this case, we have set the verifyHomepageTitle() method to be our test case, so we placed an '@Test' 
                 annotation above it.
*/

package CrossBrowsers;

import org.testng.annotations.Test;

public class TestCase {
	@Test(priority=2)   //If we give priority it will execute in sequential order
	void setup() {
		System.out.println("opening browser");
	}
	
	@Test(priority=1)
	void login() {
		System.out.println("This is login test");  //In O/P this one executed first inorder to execute in sequential order we have to pass the "Priority"
	}
	
	@Test(priority=3)
	void teardown() {
		System.out.println("closing browser");
		
	}

}

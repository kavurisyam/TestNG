package CrossBrowsers;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test
	void startCar() {
		System.out.println("Car started");
		Assert.fail(); // Here we are intentionally failing this method. so rest of the methods will be ignored hence those all are dependency methods
	}
	
	@Test(dependsOnMethods= {"startCar"})  // IF we use dependsOnMethods if 'startCar' will passed then only 'driveCar' will be executed
	void driveCar() {
		System.out.println("Car driving");
	}
	
	@Test(dependsOnMethods = {"driveCar"})
	void stopCar() {
		System.out.println("Car stopped");
	}
	
	@Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun=true)  // If we use this although the first me we intentionall failed this method will be executed.
	void parkCar() {
		System.out.println("Car parked");
	}

}

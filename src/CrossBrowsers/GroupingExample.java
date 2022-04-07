package CrossBrowsers;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"sanity"})
	void test1() {
		System.out.println("This is test1");
	}
	
	@Test(groups= {"sanity"})
	void test2() {
		System.out.println("This is test2");
	}
	
	@Test(groups= {"regression"})
	void test3() {
		System.out.println("This is test3");
	}
	
	@Test(groups= {"regression"})
	void test4() {
		System.out.println("This is test4");
	}
	
	@Test(groups= {"sanity","regression"})
	void test5() {
		System.out.println("This is test5");
	}

}



/*
 If we want to execute only particular group in testng.xml we have to specify like this
  <groups>
    
    <run>
    <include name="sanity"/>  ** If we want only regression change the name to regression. if we want both groups have to specify <include name="regression"/>
    
    <exclude name = "sanity"/> ** If we use exclude except 'sanity' it will execute rest of the methods
    
    </run>
    </groups>
    
    
    <classes>
    <class name="crossBrowsers.GroupingExample">
    </class>  
    </classes>
    
    
 * 
 */

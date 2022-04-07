package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    // This test belongs to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Starts Test execution......." +arg.getName());
    }

    // This belongs to ITestListener and will execute after starting of Test set/batch
    public  void onFinish(ITestContext arg){
        System.out.println("Finish Test execution...."+arg.getName());
    }

    // This belongs to ITestListener and will execute before the main test start i.e @Test
    public  void onTestStart(ITestResult arg0){
        System.out.println("Starts Test...."+arg0.getName());
    }


    // This belongs to ITestListener and will execute a test is Skipped.
    public  void onTestSkipped(ITestResult arg0){
        System.out.println("Skipped Test...."+arg0.getName());
    }

    // This belongs to ITestListener and will execute a test is Passed.
    public  void onTestSuccess(ITestResult arg0){
        System.out.println("Passed Test...."+arg0.getName());
    }

    // This belongs to ITestListener and will execute when a test is failed.
    public  void onTestFailure(ITestResult arg0){
        System.out.println("Failed Test...."+arg0.getName());
    }

    //Not soo important...ignore as of now
    public  void onTestFailedButWithinSuccessPercentage(ITestResult argo){
        // TODO Auto generated method stub
    }

}

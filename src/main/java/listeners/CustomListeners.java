package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {


    @Override
    public void onTestStart(ITestResult arg) {
        System.out.println("Starts Test execution................" + arg.getName);
    }

    @Override
    public void onTestSuccess(ITestResult arg) {
        System.out.println("Starts Test execution................" + arg.getName);
    }

    @Override
    public void onTestFailure(ITestResult arg) {
        System.out.println("Starts Test execution................" + arg.getName);
    }

    @Override
    public void onTestSkipped(ITestResult arg) {
        System.out.println("Starts Test execution................" + arg.getName);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        System.out.println("Starts Test execution................" + arg.getName);

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}

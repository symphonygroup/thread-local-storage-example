package is.symphony.qa;

import is.symphony.qa.browser.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExampleTests {

    private static final String URL = "http://automationpractice.com/";

    @Test()
    public void firstIndividualTest() throws InterruptedException {
        DriverManager.getDriver().get(URL);
        Thread.sleep(1000);
    }

    @Test()
    public void secondIndividualTest() throws InterruptedException {
        DriverManager.getDriver().get(URL);
        Thread.sleep(2000);
    }

    @Test()
    public void thirdIndividualTest() throws InterruptedException {
        DriverManager.getDriver().get(URL);
        Thread.sleep(3000);
    }

    @Test()
    public void fourthIndividualTest() throws InterruptedException {
        DriverManager.getDriver().get(URL);
        Thread.sleep(4000);
    }

    @Test()
    public void fifthIndividualTest() throws InterruptedException {
        DriverManager.getDriver().get(URL);
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.getDriver().quit();
        DriverManager.removeDriver();
    }
}

package is.symphony.qa.browser;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    /**
     * Create the thread local collection that will hold the future key value pairs.
     */
    private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    /**
     * Retrieves the instance that is tied to the current Thread Id.
     *
     * @return WebDriver instance tied to the Thread id.
     */
    public static WebDriver getDriver() {
        if (drivers.get() == null) {
            setDriver();
        }

        return drivers.get();
    }

    /**
     * Creates a new instance of WebDriver based on the application configurations and
     * then stores it in the "drivers" collection with current Thread Id as a reference to it.
     */
    private static void setDriver() {
        drivers.set(BrowserFactory.getChromeDriver());
    }

    /**
     * Removes the WebDriver instance that is tied to the current Thread Id.
     */
    public static void removeDriver() {
        drivers.remove();
    }
}

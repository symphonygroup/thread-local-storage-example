package is.symphony.qa.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    /**
     * Simple method to handle ChromeDriver instantiation using the fantastic
     * WebDriverManager library.
     *
     * @return ChromeDriver instance.
     */
    static ChromeDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}

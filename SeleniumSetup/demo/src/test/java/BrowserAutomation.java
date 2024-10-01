import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAutomation {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver fox = new FirefoxDriver();

        WebDriverManager.edgedriver().setup();
        WebDriver edge = new EdgeDriver();

        WebDriverManager.safaridriver().setup();
        WebDriver safari = new SafariDriver();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGClass {
    
    WebDriver driver;
    
    @BeforeTest
    public void setUpBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void openWebsite() throws InterruptedException{
        System.out.println("Opening web...");
        driver.get("https://www.google.com");
        Thread.sleep(3000);
    }

    @Test
    public void signUp(){
        System.out.println("Signing up...");
    }

    @Test
    public void LogIn(){
        System.out.println("Logging in...");
    }

    @Test
    public void AddToCart(){
        System.out.println("Adding item to cart...");
    }

    @Test
    public void LogOut(){
        System.out.println("Logging out...");
    }
}
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

    @Test (priority = 1)
    public void signUp(){
        System.out.println("Signing up...");
    }

    @Test (priority = 2)
    public void LogIn(){
        System.out.println("Logging in...");
    }

    @Test (priority = 3)
    public void AddToCart(){
        System.out.println("Adding item to cart...");
    }

    @Test (priority = 4)
    public void LogOut(){
        System.out.println("Logging out...");
    }
}
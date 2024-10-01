import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {

    /**
     * Setup Steps:
     * Install java extension
     * File explorer in vs
     * Rigth clikc, mave, new maven project
     * Add dependencies
     * done
     * @throws InterruptedException 
     */


    public static void main(String[] args) throws InterruptedException {
        String curentUrl;
        String pageTitle;
        String windowHandle;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.navigate().to("https://www.udemy.com");
        Thread.sleep(1000);

        driver.navigate().back();
        curentUrl = driver.getCurrentUrl();
        pageTitle = driver.getTitle();
        windowHandle = driver.getWindowHandle();
        System.out.println("\nCurrent Url: " + curentUrl);
        System.out.println("Current Title: " + pageTitle);
        System.out.println("Window Handle: " + windowHandle);
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.navigate().forward();
        curentUrl = driver.getCurrentUrl();
        pageTitle = driver.getTitle();
        windowHandle = driver.getWindowHandle();
        System.out.println("\nCurrent Url: " + curentUrl);
        System.out.println("Current Title: " + pageTitle);
        System.out.println("Window Handle: " + windowHandle);
        Thread.sleep(1000);
        driver.quit();
    }
}

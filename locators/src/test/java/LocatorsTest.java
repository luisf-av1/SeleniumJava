import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTest {
    public static void main(String[] args) throws InterruptedException {
        //Setup driver
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open website
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //Select element by partial text in Link element
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(1000);

        //Go back
        driver.navigate().back();
        Thread.sleep(1000);

        //Select element by text in Link element
        driver.findElement(By.linkText("Form Authentication")).click();
        Thread.sleep(1000);

        //Select element by Id
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        //Select element by name
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Select element by tag (HTML Tag)
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        //Select element by class (No compoud classes allowed)
        driver.findElement(By.className("radius")).click();
        Thread.sleep(3000);

        //Close driver
        driver.quit();
    }
}

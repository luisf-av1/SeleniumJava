import org.testng.annotations.Test;

public class TestNGClass {

    @Test
    public void openBrowser(){
        System.out.println("Opening browser...");
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
    public void LogOut(){
        System.out.println("Logging out...");
    }
}
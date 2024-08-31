import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest extends Main {

   WebDriver driver=new ChromeDriver();


    @Test
    public  void loginTest()
    {
       driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
       driver.findElement(By.id("userEmail")).sendKeys("rameshnitw08452@gmail.com");
       driver.findElement(By.id("userPassword")).sendKeys("N0t@llowed");
       driver.findElement(By.id("login")).click();
    }
}

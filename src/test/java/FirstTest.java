import org.example.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest extends Main {

   WebDriver driver=new ChromeDriver();


    @Test
    public  void loginTest()
    {
       driver.get("https://www.chess.com/");
       driver.manage().window().maximize();
    }
}

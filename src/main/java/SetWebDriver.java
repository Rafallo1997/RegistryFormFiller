import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWebDriver {
   public static WebDriver driver(){
       WebDriverManager.chromedriver().setup();

       WebDriver driver=new ChromeDriver();
       return driver;
   }
}

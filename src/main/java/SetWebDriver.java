import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWebDriver {
   public static WebDriver driver(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafał\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       return driver;
   }
}

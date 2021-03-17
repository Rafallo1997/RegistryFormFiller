package form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SetWebDriver {
    /**
     * Returns up to date  ChromeDriver
     * @return  ChromeDriver
     */
   public static WebDriver ChromeDriver(){
       WebDriverManager.chromedriver().setup();

       WebDriver driver=new ChromeDriver();
       return driver;
   }

    /**
     * Returns up to date  OperaDriver
     * @return OperaDriver
     */
   public static WebDriver OperaDriver(){
       WebDriverManager.operadriver().setup();
       WebDriver driver=new OperaDriver();
       return driver;
   }
}

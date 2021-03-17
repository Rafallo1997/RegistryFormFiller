import form.RegistrationProcess;
import form.SetWebDriver;
import org.openqa.selenium.WebDriver;

public class Main {





    public static void main(String[] args) {
        WebDriver driver = SetWebDriver.ChromeDriver();

new RegistrationProcess(driver,"d@op.pl");
    }
}

import form.EmailRegister;
import form.FormFiller;
import form.RegistrationProcess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {





    public static void main(String[] args) {
        WebDriver driver = SetWebDriver.driver();

new RegistrationProcess(driver,"d@op.pl");
    }
}

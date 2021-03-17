package form;

import form.EmailRegister;
import form.FormFiller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class FormFillerTest {
WebDriver driver= SetWebDriver.ChromeDriver();

@Test
    void Test() {
    new RegistrationProcess(driver, "ds@op.pl");
}
@AfterEach
void close(){
    driver.close();
}
}
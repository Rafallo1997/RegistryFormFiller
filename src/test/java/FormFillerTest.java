import form.EmailRegister;
import form.FormFiller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class FormFillerTest {
WebDriver driver=SetWebDriver.driver();

@Test
    void Test(){
    EmailRegister emailRegister=new EmailRegister(driver,"sd@op.pl");
    System.out.println("Is Error: "+emailRegister.isError());


    if(emailRegister.isError()==false){
        new FormFiller(driver);
    }else System.out.println("Email registration error");}

@AfterEach
void close(){
    driver.close();
}
}
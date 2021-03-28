package form;

import form.EmailRegister;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class EmailRegisterTest_Chrome {
    WebDriver ChromeDriver = SetWebDriver.ChromeDriver();

    @Test
    void Create_account_test_correct(){

        EmailRegister emailRegister=new EmailRegister(ChromeDriver,"ds@op.pl");
        assertEquals(emailRegister.isError(),false);


    }
    @Test
    void Create_account_test_incorrect(){

        EmailRegister emailRegister=new EmailRegister(ChromeDriver,"@op.pl");
        assertEquals(emailRegister.isError(),true);

    }
    @AfterEach
    void close(){
        ChromeDriver.close();
    }
}
package form;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class EmailRegisterTest_Opera {

    WebDriver OperaDriver = SetWebDriver.OperaDriver();
    @Test
    void Create_account_test_correct(){

        EmailRegister emailRegister=new EmailRegister(OperaDriver,"ds@op.pl");
        assertEquals(emailRegister.isError(),false);
OperaDriver.close();
    }
    @Test
    void Create_account_test_incorrect(){

        EmailRegister emailRegister=new EmailRegister(OperaDriver,"@op.pl");
        assertEquals(emailRegister.isError(),true);
OperaDriver.close();
    }
    @AfterEach
    void close(){
        OperaDriver.close();
    }
}
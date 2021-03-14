import form.EmailRegister;
import form.FormFiller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class EmailRegisterTest {
WebDriver driver=SetWebDriver.driver();


    @Test
   void Create_account_test_correct(){

    EmailRegister emailRegister=new EmailRegister(driver,"ds@op.pl");
    assertEquals(emailRegister.isError(),false);

}
@Test
   void Create_account_test_incorrect(){
    EmailRegister emailRegister=new EmailRegister(driver,"@op.pl");
    assertEquals(emailRegister.isError(),true);

}
@AfterEach
 void EndEach(){
    System.out.println("test complete");
driver.close();
}
@AfterAll
     static void TestEnd(){
    System.out.println("koniec");

}
}
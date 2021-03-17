package form;

import form.EmailRegister;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class EmailRegisterTest {



    @Test
   void Create_account_test_correct(){
    new EmailRegisterTest_Opera().Create_account_test_correct();
new EmailRegisterTest_Chrome().Create_account_test_correct();
}
@Test
   void Create_account_test_incorrect(){
    new EmailRegisterTest_Chrome().Create_account_test_incorrect();
    new EmailRegisterTest_Opera().Create_account_test_incorrect();
}

@AfterEach
 void EndEach(){
    System.out.println("test complete");

}
@AfterAll
     static void TestEnd(){
    System.out.println("End of testing");

}
}
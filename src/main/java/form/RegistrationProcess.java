package form;

import org.openqa.selenium.WebDriver;

public class RegistrationProcess {
    public RegistrationProcess(WebDriver driver,String email) {
        EmailRegister emailRegister=new EmailRegister(driver,email);
        System.out.println("Is Email invalid: "+emailRegister.isError());


        if(emailRegister.isError()==false){
            FormFiller formFiller=new FormFiller(driver);
        }else System.out.println("Email registration error");}

    }


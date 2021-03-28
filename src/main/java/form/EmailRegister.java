package form;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EmailRegister {
WebElement email_input;

    public boolean isError() {
        return Error;
    }

    boolean Error=false;
private String email;
WebDriverWait wait;

    /**
     * This constructor opens registration page and fills registration form with provided email
     * @param driver WebDriver to be executed with
     * @param email String with email address
     */
    public EmailRegister(WebDriver driver,String email){
        this.email=email;
wait=new WebDriverWait(driver,2);
    driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
     email_input=driver.findElement(By.id("email_create"));
            email_input.sendKeys(email);
            driver.findElement(By.id("SubmitCreate")).click();
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create_account_error")));

                Error=true;

            }catch (TimeoutException e){
                Error=false;

            }


}
}

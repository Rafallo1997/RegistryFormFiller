package form;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormFiller {
    String first_name="Chuj";
    WebElement create_account;
    WebElement form;
    WebDriver driver;

    public WebElement getForm() {
        return form;
    }

    WebDriverWait wait;

    public FormFiller(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account-creation_form\"]")));

        input(driver.findElement(By.id("customer_firstname")), first_name);
      input(driver.findElement(By.id("customer_lastname")), "Dupa");

input("passwd","dddd");
Birthday_form(12,1,1997);
    }

    /**
     * This method send keys(String) to the provided WebElement
     * @param element WebElement to send inputs
     * @param input String to be inputted
     */
    public void input(WebElement element,String input){
        if(element.getAttribute("value").isEmpty()) {

            element.sendKeys(input);
        }else System.out.println("Input "+element.getAttribute("id")+" not empty");
    }

    /**
     * This method finds WebElement by provided id and then sends keys to it
     * @param id Id of WebElement
     * @param input String to be inputted
     */
    public void input(String id,String input){

WebElement element=driver.findElement(By.id(id));
        if(element.getAttribute("value").isEmpty()) {

            element.sendKeys(input);
        }else System.out.println("Input "+element.getAttribute("id")+" not empty");
    }
    public void  select(String id,String selection){
       new Select(driver.findElement(By.id(id))).selectByValue(selection);
    }

    /**
     * This method fills Birthday select form
     * @param day
     * @param month
     * @param year
     */
    public void Birthday_form(int day,int month,int year){
        select("days", String.valueOf(day));
        select("months", String.valueOf(month));
        select("years", String.valueOf(year));
    }

}

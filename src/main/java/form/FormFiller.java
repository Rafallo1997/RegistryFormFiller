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
    private String first_name="Jan0";
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

        //Inputs//////////////

        Title_selector("Mrs");
        input(driver.findElement(By.id("customer_firstname")), first_name);
      input(driver.findElement(By.id("customer_lastname")), "Kowalski");
      input("passwd","haslo");
      Birthday_form(12,1,1997);
      input("company","Company Name");
      input("address1","StreetName");
      input("address2","45a");
      input("city","CityName");
      select_by_text("id_state","Alaska");
      input("postcode","00500");
      input("phone_mobile","123456789");
      validCheckerLoop();

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
    public void select(String id,String value){
       new Select(driver.findElement(By.id(id))).selectByValue(value);
    }
    public void select_by_text(String id,String text){
        new Select((driver.findElement(By.id(id)))).selectByVisibleText(text);
    }


    /**
     * This method fills Birthday select form
     * @param day number of day
     * @param month number of month
     * @param year number of year
     */
    public void Birthday_form(int day,int month,int year){
        select("days", String.valueOf(day));
        select("months", String.valueOf(month));
        select("years", String.valueOf(year));
    }

    /**
     * This method selects box with tile
     * @param title Type Mr or Mrs to select title
     */
    public void Title_selector(String title){
switch (title){
    case "Mr":
        driver.findElement(By.id("id_gender1")).click();
        break;
    case "Mrs":
        driver.findElement(By.id("id_gender2")).click();
        break;
}


}


    /**
     * This method loops through forms with validations and checks if there is any errors
     */
    public void validCheckerLoop(){

        for(int i=2;i<6;i++){
            String string=String.format("//*[@id=\"account-creation_form\"]/div[1]/div[%s]",i);
            WebElement validator=driver.findElement(By.xpath(string));
            String a=validator.getAttribute("class");
             String b="required form-group form-ok";
             String c="required password form-group form-ok";
             if(a.equals(b)||a.equals(c)) {
                 System.out.println(validator.getText() + " " +"OK");
             }else System.out.println(validator.getText()+" "+"Not OK");
        }
}
}

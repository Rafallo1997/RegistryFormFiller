# Registration Form Filler
This Selenium Application fills register form when creating new account on http://automationpractice.com website 



## Usage
Aplication have 3 major classes

**EmailRegister** - This class opens site http://automationpractice.com/index.php?controller=my-account then it inputs provided email adress to the form. After that it clicks on "Create an account Button". If any errors happens then it will inform about that in the log.

**FormFiller** - This class fills forms on the user creation site with methods in the class constructor. 



```java
Title_selector("Mrs");
        input(driver.findElement(By.id("customer_firstname")), "Andrzej");
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
```
**RegistrationProcess** - This class executes both **FormFiller** and **EmailRegister** classes

package locatorRepos;

import org.openqa.selenium.By;

public class CustomerRepo {

    // New Customer Locators

    public static By addCustomerBtn = By.xpath("//ul[@class='menusubnav']//a[contains(@href,'addcustomer')]");
    public static By newCustomerHeader = By.xpath("//p[@class='heading3']");
    public static By newCustomerName = By.xpath("//input[@name='name']");
    public static By newCustomerGender(int i){
        return By.xpath("//input[@name='rad1']["+i+"]");
    }
    public static By newCustomerDob = By.xpath("//input[@name='dob']");
    public static By newCustomerAddress = By.xpath("//textarea[@name='addr']");
    public static By newCustomerCity = By.xpath("//input[@name='city']");
    public static By newCustomerState = By.xpath("//input[@name='state']");
    public static By newCustomerPin = By.xpath("//input[@name='pinno']");
    public static By newCustomerTeleNum = By.xpath("//input[@name='telephoneno']");
    public static By newCustomerEmail = By.xpath("//input[@name='emailid']");
    public static By newCustomerSubmitBtn = By.xpath("//input[@type='submit']");

}

package locatorRepos;

import org.openqa.selenium.By;

public class LogInOutRepo {

    public static By loginPageHeader = By.cssSelector("h2.barone");
    public static By userId = By.xpath("//form[@name='frmLogin']//input[@name='uid']");
    public static By password = By.xpath("//form[@name='frmLogin']//input[@name='password']");
    public static By loginBtn = By.xpath("//form[@name='frmLogin']//input[@name='btnLogin']");
    public static By resetBtn = By.xpath("//form[@name='frmLogin']//input[@name='btnReset']");
    public static By loggedInIcon = By.xpath("//table[@class='layout']//img");

    public static By logoutBtn = By.xpath("//ul[@class='menusubnav']//a[contains(@href,'Log')]");
}

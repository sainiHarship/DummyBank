package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import start.initilizeBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Common extends initilizeBrowser {

    public static void type(By locator, String textToType){
        driver.findElement(locator).sendKeys(textToType);
    }

    public static void click(By locator){
        driver.findElement(locator).click();
    }

    public static boolean checkIfElementPresent(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public static List<WebElement> getWebElements(By locator){
        return driver.findElements(locator);
    }

    public static void openUrl(String url){
        driver.get(url);
    }

    public static void acceptAlert(){
        driver.switchTo( ).alert( ).accept();
    }

    public static void clickSideMenu(String menuName){
        WebElement menu = driver.findElement(By.xpath("//ul[@class='menusubnav']//a[contains(text(),'"+menuName+"')]"));
        menu.click();
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

}

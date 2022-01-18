package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import urls.Urls;
import utils.Common;

import static utils.Common.*;

public class initilizeBrowser {

    public static WebDriver driver;

    public static void init(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        openUrl(Urls.url);
    }

}

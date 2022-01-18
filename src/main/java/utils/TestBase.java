package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import start.initilizeBrowser;

import static start.initilizeBrowser.driver;

public class TestBase {

    @BeforeClass
    public void beforeClass(){
        initilizeBrowser.init();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}

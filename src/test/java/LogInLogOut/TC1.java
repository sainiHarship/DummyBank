package LogInLogOut;

import locatorRepos.LogInOutRepo;
import modules.LogInOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Common;
import utils.Log;
import utils.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static utils.Common.checkIfElementPresent;
import static utils.Common.getWebElements;

public class TC1 extends TestBase {
    LogInOut loginout = new LogInOut();
    @Test
    public void verifyLoginSuccessful() throws Exception{
        String FS = File.separator;
        Properties credProp = Common.readPropertiesFile("src" + FS + "main" + FS + "resources" + FS + "credentials.property");
        Log.info("User navigating to Home page.");
        Assert.assertTrue(checkIfElementPresent(LogInOutRepo.loginPageHeader),"User is on Home page.");
        loginout.userLogin(credProp.getProperty("userId"),credProp.getProperty("password"));
        Thread.sleep(1000l);
        Assert.assertTrue(getWebElements(LogInOutRepo.loggedInIcon).size()==3,"User successfully logged In.");
        Log.pass("User Logged in successfully.");
    }
}

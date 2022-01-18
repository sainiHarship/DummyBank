package LogInLogOut;

import locatorRepos.LogInOutRepo;
import modules.LogInOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Common;
import utils.TestBase;

import java.io.File;
import java.util.Properties;

import static utils.Common.checkIfElementPresent;

public class TC2 extends TestBase {
    LogInOut loginout = new LogInOut();

    @Test
    public void verifyLogoutSuccessful() throws Exception{
        String FS = File.separator;
        Properties credProp = Common.readPropertiesFile("src" + FS + "main" + FS + "resources" + FS + "credentials.property");
        loginout.userLogin(credProp.getProperty("userId"),credProp.getProperty("password"));
        loginout.userLogout();
        Assert.assertTrue(checkIfElementPresent(LogInOutRepo.resetBtn),"User logged out successfully.");
    }
}

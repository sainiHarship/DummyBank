package Customer;

import locatorRepos.LogInOutRepo;
import modules.Customer;
import modules.LogInOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Common;
import utils.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static utils.Common.*;

public class TC1 extends TestBase {
    Customer customer = new Customer();
    LogInOut loginout = new LogInOut();
    @Test
    public void addNewCustomer() throws IOException {
        String FS = File.separator;
        Properties customerDetailProp = readPropertiesFile("src" + FS + "main" + FS + "resources" + FS + "customerDetails.property");
        Properties credProp = Common.readPropertiesFile("src" + FS + "main" + FS + "resources" + FS + "credentials.property");
        loginout.userLogin(credProp.getProperty("userId"),credProp.getProperty("password"));
        clickSideMenu("New Customer");
        Assert.assertTrue(customer.verifyOnNewCustomerPage(), "User is on New Customer page.");
        customer.fillCustomerDetails(customerDetailProp.getProperty("Name"), customerDetailProp.getProperty("Gender"), customerDetailProp.getProperty("Dob"),
                customerDetailProp.getProperty("Address"), customerDetailProp.getProperty("City"), customerDetailProp.getProperty("State"),
                customerDetailProp.getProperty("Pin"), customerDetailProp.getProperty("Telephone"), customerDetailProp.getProperty("Email"));
        customer.newCustomerSubmit();
    }
}

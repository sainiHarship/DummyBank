package modules;
import locatorRepos.CustomerRepo;
import static utils.Common.*;

public class Customer {

    public void fillCustomerDetails(String name, String gender, String dob, String address, String city, String state, String pin, String teleNo, String email){
        type(CustomerRepo.newCustomerName,name);
        if(gender.equalsIgnoreCase("male")){
            click(CustomerRepo.newCustomerGender(1));
        }else{
            click(CustomerRepo.newCustomerGender(2));
        }
        type(CustomerRepo.newCustomerDob,dob);
        type(CustomerRepo.newCustomerAddress,address);
        type(CustomerRepo.newCustomerCity,city);
        type(CustomerRepo.newCustomerState,state);
        type(CustomerRepo.newCustomerPin,pin);
        type(CustomerRepo.newCustomerTeleNum,teleNo);
        type(CustomerRepo.newCustomerEmail,email);
    }

    public void newCustomerSubmit(){
        click(CustomerRepo.newCustomerSubmitBtn);
    }

    public boolean verifyOnNewCustomerPage(){
        return checkIfElementPresent(CustomerRepo.newCustomerHeader);
    }
}

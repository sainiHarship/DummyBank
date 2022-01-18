package modules;

import locatorRepos.LogInOutRepo;
import org.testng.Assert;

import static utils.Common.*;

public class LogInOut{

    public void userLogin(String userId, String password){
        type(LogInOutRepo.userId,userId);
        type(LogInOutRepo.password,password);
        click(LogInOutRepo.loginBtn);
    }

    public void userLogout(){
        click(LogInOutRepo.logoutBtn);
        acceptAlert();
    }

}

package testcases;


import fixture.LoginAction;
import objectRepository.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends Base {


    @Test
    public  void login() throws IOException {

         driver = initilizeDriver();

       // driver.get("https://www.shutterfly.com/");
        driver.get(getsUrl());
        LoginAction la = new LoginAction(driver);
        la.GetSignInLink().click();
        la.GetSignButton().click();
        la.GetEmail().sendKeys(getsUsername());
        la.GetPassword().sendKeys(getsPassword());
        la.GetLoginButton().click();
        la.GetLogoutLink().click();
        la.GetSignOut().click();
        closeBrowser();

    }



}

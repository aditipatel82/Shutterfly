package fixture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAction {
    WebDriver driver;

    By Email = By.xpath("//*[@id=\"email\"]");
    By Password = By.xpath("//*[@id=\"password\"]");
    By SignInLink = By.xpath("//*[@id=\"user-menu\"]/span");
    By LoginButton = By.xpath("//*[@id=\"signInButton\"]");
    By SignInButton = By.xpath("//*[@id=\"root\"]/div/header/div[1]/ul/li[1]/span/div/ul/li[1]/button");
    By logoutlink = By.xpath("//*[@id=\"user-menu\"]");
    By signout = By.xpath("//*[@id=\"root\"]/div/header/div[1]/ul/li[1]/span/div/ul/li[7]/a");

    public LoginAction(WebDriver driver) {

        this.driver = driver;

    }
    public WebElement GetEmail(){

        return driver.findElement(Email);
    }
    public WebElement GetPassword(){

        return driver.findElement(Password);
    }
    public WebElement GetLoginButton(){

        return driver.findElement(LoginButton);
    }
    public WebElement GetSignInLink(){

        return driver.findElement(SignInLink);
    }
    public WebElement GetSignButton(){

        return driver.findElement(SignInButton);
    }
    public WebElement GetLogoutLink(){
        return driver.findElement(logoutlink);
    }
    public WebElement GetSignOut(){
        return driver.findElement(signout);
    }
}

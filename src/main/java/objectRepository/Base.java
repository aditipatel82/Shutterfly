package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;
    public String sUrl;
    public String sUsername;
    public String sPassword;
    public String browserName;


    public WebDriver initilizeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/Aditi/IdeaProjects/Shutterfly/src/main/resources/data.properties");

        prop.load(fis);
        browserName = prop.getProperty("browser");
        sUrl = prop.getProperty("url");
        sUsername = prop.getProperty("username");
        sPassword = prop.getProperty("password");
        System.out.println(browserName);

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/Aditi/Downloads/chromedriver_2");
            driver = new ChromeDriver();


        }else if(browserName.equals("firefox"))
        {
             driver = new FirefoxDriver();

        }else if(browserName.equals("IE"))
        {
         //IE

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

        }

    public String getsUrl() {
        return sUrl;
    }

    public String getsUsername() {
        return sUsername;
    }

    public String getsPassword() {
        return sPassword;
    }
    public void closeBrowser(){

         driver.quit();
    }
}

package com.tekparams.actiondriver;

import com.tekparams.selenium.base.Base;
import com.tekparams.selenium.base.Home;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.tekparams.selenium.utils.CreateATextFile;
import com.tekparams.selenium.utils.WriteToAFile;

import java.time.Duration;

public class ActionDriver {
    public WebDriver driver;

    public String browserType="chrome";
    public String url="http://www.rediffmail.com";

    Home home = new Home();

    void createWebDriverInstance(){
        Base base = new Base();
        driver=base.getWebDriverInstance(browserType);
    }
    void openApplication(){
        createWebDriverInstance();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void test1(){
        openApplication();
        home.getBrokernLinksHomePage(driver);
    }
}

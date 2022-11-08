package com.tekparams.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    public WebDriver driver;


    public WebDriver getWebDriverInstance(String browserType){
        switch (browserType){
            case "chrome":
            {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case "edge":
            {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            }
            case "firefox":
            {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            }
        }
        return driver;
    }
}

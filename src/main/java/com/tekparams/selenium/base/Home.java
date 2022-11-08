package com.tekparams.selenium.base;

import com.tekparams.selenium.utils.CreateATextFile;
import com.tekparams.selenium.utils.WriteToAFile;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Home {
    public WebDriver driver1;
    public WebElement element;
    List<WebElement> elements = new ArrayList<WebElement>();
    List<WebElement> elements1 = new ArrayList<WebElement>();
    public String strLink=null;
    public String strAllLinks=null;
    CreateATextFile createATextFileObj = new CreateATextFile();
    WriteToAFile writeToAFileObj = new WriteToAFile();
    public String strLink1;
    Base base1 = new Base();

    public void getBrokernLinksHomePage(WebDriver driver){
        elements=driver.findElements(By.xpath("//a"));
//        elements=driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        for (WebElement ele :elements) {
            strLink=ele.getAttribute("href");
            strAllLinks=strAllLinks+strLink.toString()+"\n";

            driver1=base1.getWebDriverInstance("chrome");
            driver1.get(StringUtils.trim(strLink));
//            driver.navigate().to(strLink);
            elements1=driver1.findElements(By.xpath("\\a"));
            for (WebElement ele1:elements1) {
                strLink1=ele1.getAttribute("href");
                strAllLinks=strAllLinks+strLink.toString()+"\n";
            }
            driver1.close();
            driver1.quit();
//            System.out.println(ele.getText()+">>>>>>"+ele.getAttribute("href"));
        }
        createATextFileObj.createFile("C:\\Raman_Dell\\Java Training\\Ramasamy\\BrokenLinks\\BrokenLinksProject\\Results\\AllLinksWCOL.txt");
        writeToAFileObj.WriteFile("C:\\Raman_Dell\\Java Training\\Ramasamy\\BrokenLinks\\BrokenLinksProject\\Results\\AllLinksWCOL.txt",strAllLinks);

    }
    public List<WebElement> getIndividualPageLinks(WebDriver driver,String pageURL){
        driver.navigate().to(pageURL);
        elements1=driver.findElements(By.xpath("//a"));
        return elements1;
    }
}

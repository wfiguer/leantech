package com.leantech.Pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ItemInformationPage extends Base{

    By verifiedLabel = By.xpath("//*[@id=\"feature-bullets\"]/h1");

    public void verifyItem() {

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        System.out.println("paginas: " + tabs2.size());
        driver.switchTo().window(tabs2.get(1));
        String result = driver.findElement(verifiedLabel).getText();
        Assert.assertEquals("About this item", result);
        
        
    }
    
}

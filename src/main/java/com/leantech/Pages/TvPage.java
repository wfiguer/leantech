package com.leantech.Pages;



import org.openqa.selenium.By;

public class TvPage extends Base{
    
    
    By samsungCheckbox = By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[4]/span/a/span");
    By sortByButton = By.xpath("//*[@id=\"a-autoid-0-announce\"]");
    By highToLowButton = By.xpath("//*[@id=\"s-result-sort-select_2\"]");
    By secondOption = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]");

   
    public void selectSamsung() {

        driver.findElement(samsungCheckbox).click();
        
    }

    public void sortItems() throws InterruptedException {
        driver.findElement(sortByButton).click();
        driver.findElement(highToLowButton).click();
        driver.findElement(secondOption).click();
        Thread.sleep(5000);

        
    }
    
}

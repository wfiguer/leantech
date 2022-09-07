package com.leantech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    By hamburgerMenu = By.id("nav-hamburger-menu");
    By tvLabel = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a");
    By televisionLabel = By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]");

    public void openDriver() {

        System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void closeDriver() {
        driver.quit();
        
    }

    public WebDriver getdriver(){
        if (driver == null){
          driver = new ChromeDriver();
          return driver;
        }else{
          return driver;
        }
    }

    public void openAws() {
        driver.get("https://www.amazon.in/");
    }

    public void goHamburgerMenu() throws InterruptedException {

        driver.findElement(hamburgerMenu).click();
        driver.findElement(tvLabel).click();
        
    }

    public void goSelectTelevision() throws InterruptedException {
        driver.findElement(televisionLabel).click();
        Thread.sleep(5000);        
    }

  

}

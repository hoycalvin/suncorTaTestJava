package com.suncor.suncorta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainPage {
    public static void main(String[] args) {

        System.setProperty("webDriver.F.driver", "C:\\\\Users\\\\ADMIN\\\\Documents\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //question 1

        driver.quit();
        //question 2
        driver.get("https://www.suncor.com/en-ca/");
        driver.quit();
    }
}

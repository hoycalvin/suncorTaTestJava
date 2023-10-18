package com.suncor.suncorta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class MainPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hoyca\\IdeaProjects\\suncorTA\\chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        Thread.sleep(5000);
        //question 1
        driver.get("https://www.saucedemo.com/");
        //question 2
        //driver.get("https://www.suncor.com/en-ca/");
    }
}

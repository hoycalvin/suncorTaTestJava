package com.suncor.suncorta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainPage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hoyca\\IdeaProjects\\suncorTA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        //question 1

        driver.quit();
        //question 2
        driver.get("https://www.suncor.com/en-ca/");
        driver.quit();
    }
}

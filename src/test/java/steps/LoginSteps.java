package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSteps {
    WebDriver driver = new EdgeDriver();

    @Given("User navigates to e-commerce site")
    public void navigateToPage(){
        driver.get("https://www.saucedemo.com/");
    }

    @Given("user {} enters password {}")
    public void loginInfoTextBoxFilled() {
        System.out.println("User Login Success");
    }

    @And ("user clicks login button")
    public void loginButtonClicked() {
        clickLoginSubmitButton();
        System.out.println("User Login Button clicked");
    }
    public static void clickLoginSubmitButton(){
        WebDriver driver = new EdgeDriver();
        driver.findElement(By.id("//input[@id='login-button']")).click();
    }
}

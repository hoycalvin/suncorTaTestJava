package asserts;

import com.suncor.suncorta.UtilityFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAsserts {
    WebDriver driver = new ChromeDriver();
    UtilityFunctions utilityFunctions = new UtilityFunctions();

//    public void assertShoppingCartIsVisible() {
  //  }

    @Test
    public void assertShoppingCartIsVisible() {
        Assertions.assertTrue(utilityFunctions.isElementPresent(By.className("shopping_cart_link")));
    }

}

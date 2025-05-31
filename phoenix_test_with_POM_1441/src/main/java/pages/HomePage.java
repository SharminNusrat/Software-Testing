package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
        signInButton.click();
    }

    public void navigateToHome() {
        driver.get("http://localhost:4000/");
    }
}
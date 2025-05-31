package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToLogin() {
        driver.get("http://localhost:4000/sign_in");
    }

    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("button")).click();
    }

    public void loginWithEnterKey() {
        driver.findElement(By.id("user_password")).sendKeys(Keys.ENTER);
    }
}
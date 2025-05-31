package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateNewAccount() {
        driver.findElement(By.linkText("Create new account")).click();
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_first_name")));
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.id("user_last_name")).sendKeys(lastName);
    }

    public void enterSignUpEmail(String email) {
        driver.findElement(By.id("user_email")).sendKeys(email);
    }

    public void enterSignUpPassword(String password) {
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    public void enterPasswordConfirmation(String password) {
        driver.findElement(By.id("user_password_confirmation")).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(By.cssSelector("button")).click();
    }
}
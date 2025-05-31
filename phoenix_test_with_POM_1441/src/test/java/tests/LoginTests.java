package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTests extends TestBase {
    @Test
    public void loginValidInput() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();
    }

    @Test
    public void loginIncorrectEmail() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("abc@gmail.com");
        loginPage.clickLoginButton();
    }

    @Test
    public void loginInvalidPassword() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("tazkiah@gmail.com");
        loginPage.enterPassword("faoijoaq");
        loginPage.clickLoginButton();
    }
}
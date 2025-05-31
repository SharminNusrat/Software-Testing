package tests;

import org.junit.Test;

public class SignOutTests extends TestBase {
   @Test
    public void signOut() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickSignOut();
    }
}
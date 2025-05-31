package tests;

import org.junit.Test;

public class SignUpTests extends TestBase {
    @Test
    public void signUpValidEmail() {
        homePage.navigateToHome();
        signUpPage.clickCreateNewAccount();
        signUpPage.enterFirstName("nusrat");
        signUpPage.enterLastName("sharmin");
        signUpPage.enterSignUpEmail("bsse1441@iit.du.ac.bd");
        signUpPage.enterSignUpPassword("123456");
        signUpPage.enterPasswordConfirmation("123456");
        signUpPage.clickSubmitButton();
    }
}
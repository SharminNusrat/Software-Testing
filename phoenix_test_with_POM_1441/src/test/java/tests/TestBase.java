package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

public class TestBase {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SignUpPage signUpPage;
    protected BoardPage boardPage;
    protected CardPage cardPage;
    protected MemberPage memberPage;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        boardPage = new BoardPage(driver);
        cardPage = new CardPage(driver);
        memberPage = new MemberPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
package tests;

import org.junit.Test;

public class BoardTests extends TestBase {
    @Test
    public void createBoardTest() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.enterBoardName("Board5");
        boardPage.clickSignOut();
    }

    @Test
    public void createList() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        boardPage.clickAddNewList();
        boardPage.enterListName("List2");
    }

    @Test
    public void updateList() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        boardPage.clickAddNewList();
        boardPage.updateListName("MyList");
    }
}
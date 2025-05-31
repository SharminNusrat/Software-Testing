package tests;

import org.junit.Test;

public class MemberTests extends TestBase {
    @Test
    public void addNewMember() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        memberPage.clickAddMemberButton();
        memberPage.enterMemberEmail("bsse1441@iit.du.ac.bd");
        memberPage.clickAddButton();
    }
}
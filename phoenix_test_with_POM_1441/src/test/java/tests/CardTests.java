package tests;

import org.junit.Test;

public class CardTests extends TestBase {
    @Test
    public void addCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        cardPage.clickAddNewCard();
        cardPage.enterCardName("This is card1");
    }

    @Test
    public void editCardDescription() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        cardPage.openCard("card_13");
        cardPage.clickEditButton();
        cardPage.enterCardDescription("Description of card 1");
        cardPage.closeCardWindow();
    }

    @Test
    public void addCommentToCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        cardPage.openCard("card_13");
        cardPage.addComment("First comment");
        cardPage.closeCardWindow();
    }

    @Test
    public void addMemberToCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        cardPage.openCard("card_13");
        cardPage.clickCardFooter();
        cardPage.clickMembersButton();
        cardPage.selectMember();
    }

    @Test
    public void addAndRemoveTagToCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");

        cardPage.openCard("card_13");
        cardPage.clickTagsTab();
        cardPage.selectTag("purple");
        cardPage.selectTag("blue");
        cardPage.clickTagsTab();
        cardPage.removeTag();
        cardPage.closeCardWindow();
    }

    @Test
    public void removeMemberFromCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");

        cardPage.clickAddNewCard();
        cardPage.openCard("card_13");
        cardPage.clickCardFooter();
        cardPage.clickMembersButton();
        cardPage.hoverOverMemberButton();
        cardPage.resetMousePosition();
        cardPage.selectMemberToRemove();
        cardPage.clickMembersButtonAgain();
        cardPage.confirmMemberRemoval();
        cardPage.closeCardWindow();
    }

    @Test
    public void submitEmptyComment() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.selectBoardWithActions("37 2-abc");

        cardPage.clickAddNewCard();
        cardPage.clickOnCanvas();
        cardPage.openCard("card_18");
        cardPage.interactWithCommentField();
        cardPage.submitEmptyComment();
    }

    @Test
    public void deleteCard() {
        loginPage.navigateToLogin();
        loginPage.enterEmail("john@phoenix-trello.com");
        loginPage.enterPassword("12345678");
        loginPage.loginWithEnterKey();

        boardPage.clickAddNewBoard();
        boardPage.selectBoard("37 2-abc");
        cardPage.openCard("card_13");
        cardPage.deleteCard();
    }
}
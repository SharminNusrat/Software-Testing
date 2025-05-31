package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BoardPage extends BasePage {
    public BoardPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddNewBoard() {
        WebElement addBoardButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_new_board")));
        addBoardButton.click();
    }

    public void enterBoardName(String boardName) {
        WebElement boardNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("board_name")));
        boardNameField.sendKeys(boardName);
        boardNameField.sendKeys(Keys.ENTER);
    }

    public void selectBoard(String boardId) {
        driver.findElement(By.cssSelector("#\\" + boardId + " h4")).click();
    }

    public void clickAddNewList() {
        driver.findElement(By.cssSelector(".add-new > .inner")).click();
    }

    public void enterListName(String listName) {
        WebElement listNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("list_name")));
        listNameField.sendKeys(listName);
        listNameField.sendKeys(Keys.ENTER);
    }

    public void updateListName(String newName) {
        WebElement listNameField = driver.findElement(By.id("list_name"));
        listNameField.clear();
        listNameField.sendKeys(newName);
        driver.findElement(By.cssSelector("button")).click();
    }

    public void clickSignOut() {
        WebElement signOutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#crawler-sign-out > span")));
        signOutButton.click();
    }

    public void selectBoardWithActions(String boardId) {
        WebElement boardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#\\" + boardId + " > .inner")));

        new Actions(driver)
                .moveToElement(boardElement)
                .clickAndHold()
                .perform();

        new Actions(driver)
                .moveToElement(boardElement)
                .perform();

        new Actions(driver)
                .moveToElement(boardElement)
                .release()
                .perform();

        boardElement.click();
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CardPage extends BasePage {
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddNewCard() {
        driver.findElement(By.linkText("Add a new card...")).click();
    }

    public void enterCardName(String cardName) {
        WebElement cardNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("card_name")));
        cardNameField.sendKeys(cardName);
        driver.findElement(By.cssSelector("button")).click();
    }

    public void openCard(String cardId) {
        driver.findElement(By.cssSelector("#" + cardId + " span")).click();
    }

    public void clickEditButton() {
        driver.findElement(By.linkText("Edit")).click();
    }

    public void enterCardDescription(String description) {
        WebElement descriptionField = driver.findElement(By.cssSelector("textarea:nth-child(2)"));
        descriptionField.clear();
        descriptionField.sendKeys(description);
        driver.findElement(By.cssSelector("button:nth-child(3)")).click();
    }

    public void closeCardWindow() {
        driver.findElement(By.cssSelector(".fa-close")).click();
    }

    public void addComment(String comment) {
        WebElement commentField = driver.findElement(By.cssSelector("textarea"));
        commentField.clear();
        commentField.sendKeys(comment);
        driver.findElement(By.cssSelector("button")).click();
    }

    public void clickTagsTab() {
        driver.findElement(By.linkText("Tags")).click();
    }

    public void selectTag(String color) {
        driver.findElement(By.cssSelector("." + color)).click();
    }

    public void removeTag() {
        driver.findElement(By.cssSelector(".selected")).click();
    }

    public void clickCardFooter() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#card_13 footer"))).click();
    }

    public void clickMembersButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".button:nth-child(2) > span"))).click();
    }

    public void selectMember() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("ul:nth-child(2) span:nth-child(2)"))).click();
    }

    public void hoverOverMemberButton() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".button:nth-child(2) > span")));
        new Actions(driver).moveToElement(element).perform();
    }

    public void resetMousePosition() {
        WebElement element = driver.findElement(By.tagName("body"));
        new Actions(driver).moveToElement(element, 0, 0).perform();
    }

    public void selectMemberToRemove() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("ul:nth-child(2) span:nth-child(2)"))).click();
    }

    public void clickMembersButtonAgain() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".button:nth-child(2) > span"))).click();
    }

    public void confirmMemberRemoval() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("ul:nth-child(2) > li > a"))).click();
    }

    public void deleteCard() {
        driver.findElement(By.cssSelector(".fa-trash-o")).click();
    }

    public void clickOnCanvas() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".canvas"))).click();
    }

    public void interactWithCommentField() {
        WebElement textarea = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("textarea")));

        new Actions(driver)
                .moveToElement(textarea)
                .clickAndHold()
                .perform();

        new Actions(driver)
                .moveToElement(textarea)
                .perform();

        new Actions(driver)
                .moveToElement(textarea)
                .release()
                .perform();

        textarea.click();
    }

    public void submitEmptyComment() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button"))).click();
    }
}
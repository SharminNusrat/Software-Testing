package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MemberPage extends BasePage {
    public MemberPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddMemberButton() {
        driver.findElement(By.cssSelector(".fa-plus")).click();
    }

    public void enterMemberEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("crawljax_member_email")));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickAddButton() {
        driver.findElement(By.cssSelector("button")).click();
    }

    public void removeMember() {
        driver.findElement(By.cssSelector("ul:nth-child(2) > li > a")).click();
    }
}
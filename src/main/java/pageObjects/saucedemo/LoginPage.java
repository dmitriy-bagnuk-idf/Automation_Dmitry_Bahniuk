package pageObjects.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

import static driver.SimpleDriver.getWebDriver;

public class LoginPage extends BasePage {
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By blockedUser = By.xpath("//h3[@data-test]");

    public LoginPage open() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage open(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterUserName(String username) {
        enter(this.username, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enter(this.password, password);
        return this;
    }

    public LoginPage clickLoginBtn() {
        click(loginBtn);
        return this;
    }

    public LoginPage verifyThatLoginPageIsClosed() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
        return this;

    }

    public void verifyBlockedUser() {
        Assert.assertEquals(getWebDriver().findElement(blockedUser).getText(),
                "Epic sadface: Sorry, this user has been locked out.");
    }

    public LoginPage open() {
        load("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage open(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterUserName(String username) {
        enter(this.username, username);
        return this;
    }

    public LoginPage enterUserName() {
        enter(this.username, properties.getProperty("standard_user"));
        return this;
    }

    public LoginPage enterPassword(String password) {
        enter(this.password, password);
        return this;
    }

    public LoginPage enterPassword() {
        enter(this.password, properties.getProperty("password"));
        return this;
    }

    public LoginPage clickLoginBtn() {
        click(loginBtn);
        return this;
    }

    public LoginPage verifyThatLoginPageIsClosed() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
        return this;

    }

    public LoginPage verifyBlockedUser() {
        Assert.assertEquals(getText(blockedUser),
                "Epic sadface: Sorry, this user has been locked out.");
        return this;
    }

    public LoginPage verifyWrongData() {
        Assert.assertEquals(getText(blockedUser),
                "Epic sadface: Username and password do not match any user in this service");
        return this;
    }

    public void verifyWrongData() {
        Assert.assertEquals(getWebDriver().findElement(blockedUser).getText(),
                "Epic sadface: Username and password do not match any user in this service");
    }
    public LoginPage standardEnterData(Login login) {
        enterUserName(login.getUsername());
        enterPassword(login.getPassword());
        clickLoginBtn();
        return this;
    }

    public LoginPage standardEnterData(LoginBuilder loginBuilder) {
        enterUserName(loginBuilder.getUsername());
        enterPassword(loginBuilder.getPassword());
        clickLoginBtn();
        return this;
    }
}



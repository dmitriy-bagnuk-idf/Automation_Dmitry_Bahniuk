package pageObjects.saucedemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class BasketPage extends BasePage {
    private final By itemBackPack = By.id("item_4_title_link");
    private final By itemBikeLight = By.id("item_0_title_link");
    private final By itemBoltTShirt = By.id("item_1_title_link");
    private final By removeBackPackFromCartBtn = By.id("remove-sauce-labs-backpack");
    private final By cartBtn = By.id("shopping_cart_container");
    private final By checkoutBtn = By.id("checkout");
    private final By topRemoveBtn = By.xpath("(//button[text()='Remove'])[1]");
    private final By topRemoveBtn = By.xpath("(//button[text()='Remove'])[1]");

    public BasketPage verifyBackPackInCart() {
        Assert.assertEquals(getText(itemBackPack), "Sauce Labs Backpack");
        return this;
    }

    public void verifyBackPackInCart() {
        Assert.assertEquals(getWebDriver().findElement(itemBackPack).getText(), "Sauce Labs Backpack");
    public BasketPage verifyBikeLightInCart() {
        Assert.assertEquals(getText(itemBikeLight), "Sauce Labs Bike Light");
        return this;
    }

    public void verifyBikeLightInCart() {
        Assert.assertEquals(getWebDriver().findElement(itemBikeLight).getText(), "Sauce Labs Bike Light");
    }

    public void verifyBoltTShirtInCart() {
        Assert.assertEquals(getWebDriver().findElement(itemBoltTShirt).getText(), "Sauce Labs Bolt T-Shirt");
    }

    public void verifyThreeItemsInCart() {
        Assert.assertEquals(getWebDriver().findElement(itemBackPack).getText(), "Sauce Labs Backpack");
        Assert.assertEquals(getWebDriver().findElement(itemBikeLight).getText(), "Sauce Labs Bike Light");
        Assert.assertEquals(getWebDriver().findElement(itemBoltTShirt).getText(), "Sauce Labs Bolt T-Shirt");
    }

    public void clickRemoveFromCartBtn() {
        click(removeBackPackFromCartBtn);

    public BasketPage verifyBoltTShirtInCart() {
        Assert.assertEquals(getText(itemBoltTShirt), "Sauce Labs Bolt T-Shirt");
        return this;
    }

    public BasketPage verifyThreeItemsInCart() {
        Assert.assertEquals(getText(itemBackPack), "Sauce Labs Backpack");
        Assert.assertEquals(getText(itemBikeLight), "Sauce Labs Bike Light");
        Assert.assertEquals(getText(itemBoltTShirt), "Sauce Labs Bolt T-Shirt");
        return this;
    }

    public BasketPage clickRemoveFromCartBtn() {
        click(removeBackPackFromCartBtn);
        return this;
    }

    public BasketPage clickCheckoutButton() {

    public void clickCheckoutButton() {
        click(checkoutBtn);
        return this;
    }
    public BasketPage deleteThreeItemsFromCart(){
        for(int i=0; i<3;i++){
            click(topRemoveBtn);
        }
        return this;
    }
    public BasketPage verifyNoItemsInCart(){
        Assert.assertEquals(getText(cartBtn), "");
        return this;
    }
    public BasketPage verifyItemInCart(String locator, String itemName){
        Assert.assertEquals(driver.findElement(By.id(locator)).getText(), itemName);
        return this;

    }
    public void deleteThreeItemsFromCart(){
        for(int i=0; i<3;i++){
        click(topRemoveBtn);
        }
    }
    public void verifyNoItemsInCart(){
        Assert.assertTrue(getWebDriver().findElement(cartBtn).getText().isEmpty());
    }
    public BasketPage verifyItemInCart(String locator, String itemName){
        Assert.assertEquals(driver.findElement(By.id(locator)).getText(), itemName);
        return this;
    }
}

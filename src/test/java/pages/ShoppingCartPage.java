package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ReusableMethods;

public class ShoppingCartPage {
    AndroidDriver driver;
    ReusableMethods methods;
    String productNameOnCart;
    public ShoppingCartPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    //By sepettekiUrunAdi = By.id("(trendyol.com:id/textViewBrandName)[1]");
    By sepettekiUrunAdi = By.xpath("(//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewBrandName\"])[1]");
    By plusButton = By.id("trendyol.com:id/image_add");
    By copKutusu1 = By.id("trendyol.com:id/imageViewDeleteProduct");
    By copKutusu2 = By.id("trendyol.com:id/textViewBasketRemoveAction");
    By emptyMessage = By.id("trendyol.com:id/textViewMessage");

    public void checkProductOnShoppingCart(){
        productNameOnCart = methods.getText(sepettekiUrunAdi).toLowerCase();
        System.out.println("productNameOnCart = " + productNameOnCart);

        Assert.assertEquals(productNameOnCart, ProductsPage.productName.toLowerCase());
    }
    public void increaseProductByTwoOnShoppingCart() throws InterruptedException {
        methods.click(plusButton);
        Thread.sleep(2000);
        methods.click(plusButton);
    }

    public void removeProductFromFirstShoppingCart() {
        methods.click(copKutusu1);
    }

    public void removeProductFromSecondShoppingCart() {
        methods.click(copKutusu2);
    }

    public void checkEmptyMessage(String str){

        Assert.assertEquals(methods.getText(emptyMessage),str);
    }



}

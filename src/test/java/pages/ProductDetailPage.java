package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class ProductDetailPage {
    AndroidDriver driver;
    ReusableMethods methods;
    public ProductDetailPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By addToCartButton = By.id("trendyol.com:id/primaryButton");
    //By cartIcon = By.id("trendyol.com:id/productDetailBasket");
    By cartIcon = By.id("trendyol.com:id/productDetailBasketItemCount");

//    public void addProductToShoppingCart(){
//        methods.click(addToCartButton);
//    }
//    public void clickShoppingCartIcon(){
//        methods.click(cartIcon);
//    }

    public void sepeteEkleButonuClickle() {
        methods.click(addToCartButton);
    }

    public void sepetIconuTikla() {
        methods.click(cartIcon);
    }
}

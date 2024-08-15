package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class OfferPage {
    AndroidDriver driver;
    ReusableMethods methods; // ReusableMethods dan bir obje olusturuldu. ReusableMethods daki methodlari kullanmak icin

    public OfferPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By closeButton = By.id("trendyol.com:id/imageButtonClose");

    public void clickCloseButton() {
        methods.click(closeButton);
    }
}
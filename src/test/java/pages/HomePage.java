package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class HomePage {
    AndroidDriver driver;
    ReusableMethods methods; // ReusableMethods dan bir obje olusturuldu. ReusableMethods daki methodlari kullanmak icin

    public HomePage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By popupCloseButton = By.id("trendyol.com:id/imageViewTooltipClose");
    By searchBox = By.id("trendyol.com:id/edittext_search_view");

//    public void clickCloseButtonOnHomePagePopup() {
//
//        methods.click(popupCloseButton);
//    }

    public void ClickSearchbox() {
        methods.click(searchBox);
    }
}
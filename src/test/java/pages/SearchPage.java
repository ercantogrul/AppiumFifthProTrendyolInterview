package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class SearchPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public SearchPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By popupCloseButton = By.id("trendyol.com:id/imageViewTooltipClose");
    By searchBox = By.id("trendyol.com:id/edittext_search_view");


    public void sendKeys(String str) {
        methods.sendKeys(searchBox, str);
    }

    public void pressKeySEARCHButton() {
        methods.clickSearchButton();
    }

    public void clickClosePopup() {
        methods.click(popupCloseButton);
    }


}
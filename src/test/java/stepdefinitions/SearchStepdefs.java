package stepdefinitions;

import io.cucumber.java.en.And;
import pages.SearchPage;
import utilities.DriverFactory;

public class SearchStepdefs {
    SearchPage sp = new SearchPage(DriverFactory.getDriver());

    @And("sendKeys {string}")
    public void sendkeys(String str) {
        sp.sendKeys(str);
    }

    @And("pressKey SEARCH button")
    public void presskeySEARCHButton() {
        sp.pressKeySEARCHButton();
    }

    @And("Arama sonuç popup kapat")
    public void aramaSonucPopupKapat() {
        sp.clickClosePopup();
    }




}

package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ProductDetailPage;
import utilities.DriverFactory;

public class ProductDetailPageStepdefs {
    ProductDetailPage pDp = new ProductDetailPage(DriverFactory.getDriver());

    @And("Ürün detay sayfasında SEPETE EKLE buttonuna clickle")
    public void urunDetaySayfasındaSEPETEEKLEButtonunaClickle() {
        pDp.sepeteEkleButonuClickle();
    }

    @And("Sepete gitmek için ekranın üst bölümündeki sepet iconuna tıkla")
    public void sepeteGitmekIcinEkranınUstBolumundekiSepetIconunaTıkla() {
        pDp.sepetIconuTikla();
    }
}

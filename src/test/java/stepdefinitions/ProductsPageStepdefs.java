package stepdefinitions;

import io.cucumber.java.en.And;
import pages.ProductsPage;
import utilities.DriverFactory;

public class ProductsPageStepdefs {


    ProductsPage sp = new ProductsPage(DriverFactory.getDriver());



    @And("{int}. ürüne kadar scrollDown yap")
    public void uruneKadarScrollDownYap(int sayi) {
        sp.uruneKadarScrollDownYap(sayi);

    }

    @And("{int}. ürüne tıklamadan önce ismini string olarak bir değişkene ata")
    public void uruneTıklamadanOnceIsminiStringOlarakBirDegiskeneAta(int sayi) {
        sp.tiklamadanUnceUrunIsimBilgisi(sayi);

    }

    @And("{int}. ürüne clickle")
    public void uruneClickle(int sayi) {
        sp.uruneClickle(sayi);
    }


}

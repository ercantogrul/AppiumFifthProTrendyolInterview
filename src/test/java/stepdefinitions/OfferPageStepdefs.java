package stepdefinitions;

import io.cucumber.java.en.And;
import pages.OfferPage;
import utilities.DriverFactory;

public class OfferPageStepdefs {
    OfferPage op = new OfferPage(DriverFactory.getDriver());

    @And("Kampanya sayfasını kapat")
    public void kampanyaSayfasınıKapat() {
        op.clickCloseButton();
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.GenderPage;
import utilities.DriverFactory;

public class GenderPageStepdefs {
    GenderPage gp = new GenderPage(DriverFactory.getDriver());


    @Given("Cinsiyet sayfasını kapat")
    public void cinsiyetSayfasınıKapat() {
        gp.clickCloseButton();
    }
}

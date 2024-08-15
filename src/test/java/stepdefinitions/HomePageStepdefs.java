package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.DriverFactory;

public class HomePageStepdefs {

    HomePage hp = new HomePage(DriverFactory.getDriver());

    @And("HomePage pop-up'ı kapatılmıştır \\(eğer çıkıyorsa)")
    public void homepagePopUpIKapatılmıstırEgerCıkıyorsa() {
      //  hp.clickCloseButtonOnHomePagePopup();

    }

    @When("click searchbox")
    public void clickSearchbox() {
        hp.ClickSearchbox();
    }


}

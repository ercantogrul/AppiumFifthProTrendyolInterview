package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCartPage;
import utilities.DriverFactory;

public class ShoppingCartPageStepdefs {
    ShoppingCartPage scp = new ShoppingCartPage(DriverFactory.getDriver());

    @Then("Sepetteki ürün ismi ile verification yap")
    public void sepettekiUrunIsmiIleVerificationYap() {
        scp.checkProductOnShoppingCart();
        
    }

    @When("Sepetteki + buttonuna iki defa tıklayarak adeti iki artır")
    public void sepettekiButtonunaDefaTıklayarakAdetiIkiArtır() throws InterruptedException {
        scp.increaseProductByTwoOnShoppingCart();
    }

    @And("Sepetteki ürünün sağ üst köşesindeki çöp kutusunu clickle")
    public void sepettekiUrununSagUstKosesindekiCopKutusunuClickle() {
        scp.removeProductFromFirstShoppingCart();
    }

    @And("Alttan çıkan popuptaki çöp kutusunu clickle")
    public void alttanCıkanPopuptakiCopKutusunuClickle() {
        scp.removeProductFromSecondShoppingCart();
    }


    @Then("{string} elementinin görüldüğünü doğrula")
    public void elementininGoruldugunuDogrula(String str) {
        scp.checkEmptyMessage(str);
    }
}

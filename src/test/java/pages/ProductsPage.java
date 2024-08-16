package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class ProductsPage {
    AndroidDriver driver;
    ReusableMethods methods;
    static String productName;

    public ProductsPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By popupCloseButton = By.id("trendyol.com:id/imageViewTooltipClose");
    //By product = By.xpath("(//android.widget.TextView[@resource-id='trendyol.com:id/textview_title_product'])[1]");
    By product = By.xpath("(//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/composeViewProductTitle\"])[1]//android.widget.TextView");
   // By product = By.xpath("(//android.view.View/android.widget.TextView)[1]");
    By indexNo = By.id("trendyol.com:id/textViewScrolledItemCount");



//    public void clickProductOnProductPage(int number) throws InterruptedException {
//        methods.click(popupCloseButton);
//        methods.scrollDown();
//        methods.scrollDown();
//        methods.scrollDown();
//        Thread.sleep(3000);
//        productName = methods.getText(product);
//        methods.click(product);
//    }

    public void uruneKadarScrollDownYap(int sayi) {

        if(sayi % 2 == 0) {
            sayi+=2;
       }else{
            sayi+=3;
       }
       String sayfaSayisi = String.valueOf(sayi);
       //!methods.getText(indexNo).contains(sayfaSayisi)

        boolean sayac = true;
        // 7. WebElementin textini almak icin (index=10 e kadar) scrollDown yapiyoruz. yapinca ekranda 7,8,9 ve 10. ürünler görünmektedir.

        do{// burada index=10 e kadar scrollDown() yapiyoruz.
            if (!methods.getText(indexNo).equals(sayfaSayisi)){
                methods.scrollDown();
            }else{
                sayac = false;
            }
        }while(sayac);
    }

    public void tiklamadanUnceUrunIsimBilgisi(int sayi) {
        productName= methods.getText(product);
        System.out.println("productName.toLowerCase() = " + productName.toLowerCase());
    }

    public void uruneClickle(int sayi) {
        methods.click(product);
    }
}

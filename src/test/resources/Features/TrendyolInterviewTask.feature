@TrendyolInterviewFeature
Feature: Trendyol Interview Feature

  Scenario: Trendyol Interview Task-1
    Given Cinsiyet sayfasını kapat
    And Kampanya sayfasını kapat
    And HomePage pop-up'ı kapatılmıştır (eğer çıkıyorsa)
    When click searchbox
    And sendKeys "saat"
    And pressKey SEARCH button
    And Arama sonuç popup kapat
    And 7. ürüne kadar scrollDown yap
    And 7. ürüne tıklamadan önce ismini string olarak bir değişkene ata
    And 7. ürüne clickle
    And Ürün detay sayfasında SEPETE EKLE buttonuna clickle
    And Sepete gitmek için ekranın üst bölümündeki sepet iconuna tıkla
    Then Sepetteki ürün ismi ile verification yap
    When Sepetteki + buttonuna iki defa tıklayarak adeti iki artır
    And Sepetteki ürünün sağ üst köşesindeki çöp kutusunu clickle
    And Alttan çıkan popuptaki çöp kutusunu clickle
    Then "Sepetinizde ürün bulunmamaktadır" elementinin görüldüğünü doğrula





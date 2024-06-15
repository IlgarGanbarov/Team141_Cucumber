Feature: kullanici testotomasyonu sayfasinda arama yapar
  Scenario:TC15 kullanici coklu urun aramasi yapabilmeli

  Scenario Outline: : TC15 kullanici coklu urun aramasi yapabilmeli
    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelime>" yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir
    Examples: :
      |aranacakKelimele|
      |phone  |
      |java   |
      |nutella|
      |dress  |
      |apple  |
      |samsung|
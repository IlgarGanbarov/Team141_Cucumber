package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SauceDemoPage;

public class SaucedemoStepdefinitions {

    SauceDemoPage sauceDemoPage= new SauceDemoPage();
    String ilkUrunIsmi = "";

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String username) {
        sauceDemoPage.usernameKutusu.sendKeys(username);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String password) {
        sauceDemoPage.passwordKutusu.sendKeys(password);
    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        sauceDemoPage.loginButonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunIsmi = sauceDemoPage.ilkUrunIsimElementi.getText();

        sauceDemoPage.ilkUrunIsimElementi.click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
        sauceDemoPage.addToCartButonu.click();
    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
       sauceDemoPage.alisverisSepetiLinki.click();
    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        String expectedUrunIsmi = ilkUrunIsmi ;
        String actualUrunIsmi = sauceDemoPage.sepettekiUrunIsimElementi.getText();

        Assertions.assertEquals(expectedUrunIsmi, actualUrunIsmi);

    }














}

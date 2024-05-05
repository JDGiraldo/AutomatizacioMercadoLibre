package steps;

import io.cucumber.java.en.*;
import pages.PaginaIngresoCuenta;
import pages.PaginaLoginEmail;
import pages.PaginaPc;
import pages.PaginaPrincipal;
import pages.PaginaResultadoBusqueda;

public class MercadoLibreSteps {

    PaginaPrincipal landingAmazon = new PaginaPrincipal();
    PaginaResultadoBusqueda resultSearch = new PaginaResultadoBusqueda();
    PaginaPc pagePc = new PaginaPc();
    PaginaIngresoCuenta pageLogin =  new PaginaIngresoCuenta();
    PaginaLoginEmail pageEmail = new PaginaLoginEmail();

    @Given("I navigate to MercadoLibre")
    public void iNavigateToFRT(){
        landingAmazon.navigateToMercadoLibre();
    }
    @Then("Write to search")
    public void writeToSearch(){
        landingAmazon.inputSearch("portatil");
        landingAmazon.clickSearchButton();
    }
    @And("Select pc")
    public void selectPc(){
        resultSearch.ClickCokkie();
        resultSearch.clickPc();
        pagePc.clickBuyButton();
        pageLogin.loginButton();
        pageEmail.inputEmail("giraldo.juan.die@gmail.com");
        pageEmail.clickButtonCotinuar();

    }
    
}

package pages;


public class PaginaPrincipal  extends BasePage{

    private String barSearch ="//input[@id='cb1-edit']";
    private String clickSearch="//div[@aria-label='Buscar']";


    public PaginaPrincipal(){
        super(driver);
    }
    //Metodo para navegar a Amazon
    public void navigateToMercadoLibre(){
        navigateTo("https://www.mercadolibre.com.co/");
    }

    public void inputSearch(String search){
        // Reemplaza el marcador de posición en sectionLink con el nombre
        write(barSearch,search);
    }
    public void clickSearchButton() {
        clickElement(clickSearch);
    }

}

package pages;

public class PaginaResultadoBusqueda extends BasePage{

    private String selectorPc = "//a[@title='Laptop Gamer Hp Victus 15-fb0103la Ryzen5,8gb,512,rtx 3050 Color Negro']";
    private String acceptCookie = "//button[normalize-space()='Aceptar cookies']";
    public PaginaResultadoBusqueda(){
        super(driver);
    }
    public void ClickCokkie(){
        clickElement(acceptCookie);
    }

    public void clickPc(){
        clickElement(selectorPc);
    }
    
}

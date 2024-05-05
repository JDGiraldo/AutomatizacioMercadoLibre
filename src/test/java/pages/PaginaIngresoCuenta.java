package pages;

public class PaginaIngresoCuenta extends BasePage{

    private String buttonLogin = "//span[normalize-space()='Ingresar']";

    public PaginaIngresoCuenta(){
        super(driver);
    }

    public void loginButton(){
        clickElement(buttonLogin);
    }

    
}

package pages;

public class PaginaLoginEmail extends BasePage{
    
    private String email="//input[@id='user_id']";
    private String clickContinuo = "//span[normalize-space()='Continuar']";
    
    public PaginaLoginEmail(){
        super(driver);
    }
    
    public void inputEmail(String inputEmail){
        // Reemplaza el marcador de posición en sectionLink con el nombre
        write(email,inputEmail);
    }
    public void clickButtonCotinuar(){
        clickElement(clickContinuo);
    }
}

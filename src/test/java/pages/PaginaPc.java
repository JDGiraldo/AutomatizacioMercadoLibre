package pages;

public class PaginaPc extends BasePage{

    private String buyButton = "//span[@class='andes-button__content'][normalize-space()='Comprar ahora']";

    public PaginaPc(){
        super(driver);
    }
    public void clickBuyButton(){
        clickElement(buyButton);
    }
    
}

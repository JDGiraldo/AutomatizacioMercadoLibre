package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class PageMercadoLibreTest {
    
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Inizializa el webDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    @Test
    public void navegamosAFreeRangeTesters(){
        //Navega a la pagina Web
        driver.get("https://www.mercadolibre.com.co");
    }

    @AfterMethod
    public void tearDown(){
        //Cierra el navegador despues
        if(driver != null){
            driver.quit();
        }
    }
    
}
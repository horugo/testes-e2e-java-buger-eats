package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//domain specific language
public class DSL {
    private WebDriver driver;

    public  DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void escrever(WebElement elemento, String texto) {
        elemento.clear();
        elemento.sendKeys(texto);
    }
}

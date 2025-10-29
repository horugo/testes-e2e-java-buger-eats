package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public void clicar(WebElement elemento) {
        elemento.click();
    }

    //Esperar
    public void esperaCampoSerPreenchido(WebElement elemento, String texto) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> {
            String valor = elemento.getAttribute("value");
            return valor != null && !valor.trim().isEmpty();
        });
    }
}

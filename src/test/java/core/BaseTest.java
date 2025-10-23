package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected WebDriver driver = DriverFactory.getDriver();

    @BeforeEach
    public void inicializa() {
        driver.get("https://buger-eats.vercel.app/");
        driver.findElement(By.xpath("//strong[normalize-space()='Cadastre-se para fazer entregas']"))
                .click();
    }

    @AfterEach
    public void finalizar() {
        DriverFactory.quitDriver();
    }
}

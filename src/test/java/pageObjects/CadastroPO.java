package pageObjects;

import core.DSL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPO {
    private DSL dsl;

    @FindBy(css = "input[placeholder='Nome completo']")
    private WebElement nomeInput;

    @FindBy(css = "input[placeholder='CPF somente números']")
    private WebElement cpfInput;

    public  CadastroPO(WebDriver driver) {
        this.dsl = new DSL(driver);
        PageFactory.initElements(driver, this);
    }

    public void escreverNome(String nome) {
        dsl.escrever(nomeInput, nome);
    }

    public void escreverCpf(String cpf) {
        dsl.escrever(cpfInput, cpf);
    }

    public String obterNome() {
        return nomeInput.getAttribute("value");
    }
}

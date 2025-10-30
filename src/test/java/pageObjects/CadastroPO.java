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

    @FindBy(css = "input[placeholder='CEP']")
    private WebElement cepInput;

    @FindBy(css = "input[placeholder='Rua']")
    private WebElement ruaInput;

    @FindBy(css = "input[value='Buscar CEP']")
    private WebElement cepButton;

    public  CadastroPO(WebDriver driver) {
        this.dsl = new DSL(driver);
        PageFactory.initElements(driver, this);
    }
    //Escrever
    public void escreverNome(String nome) {
        dsl.escrever(nomeInput, nome);
    }

    public void escreverCpf(String cpf) {
        dsl.escrever(cpfInput, cpf);
    }

    public void escreverCep(String cep) {
        dsl.escrever(cepInput, cep);
    }
    //Obter
    public String obterNome() {
        return nomeInput.getAttribute("value");
    }

    public String obterRua() {
        return ruaInput.getAttribute("value");
    }
    //clicar
    public void clicarBuscarCep() {
        dsl.clicar(cepButton);
    }

    //Espera
    public  void esperaRuaEstarPreenchida (String rua) {
        dsl.esperaCampoSerPreenchido(ruaInput, rua);
    }

}

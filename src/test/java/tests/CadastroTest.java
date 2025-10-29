package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CadastroPO;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroTest extends BaseTest {
    private CadastroPO cadastroPO = new CadastroPO(driver);

    @Test
    public void teste1() {
        cadastroPO.escreverNome("João da Silva");
        cadastroPO.escreverCpf("12345678900");
        cadastroPO.escreverCep("04961-020");
        cadastroPO.clicarBuscarCep();

        cadastroPO.esperaRuaEstarPreenchida("Estrada Plínio Dias");
        assertEquals("Estrada Plínio Dias", cadastroPO.obterRua());
    }
}

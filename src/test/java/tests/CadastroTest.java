package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pageObjects.CadastroPO;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroTest extends BaseTest {
    private CadastroPO cadastroPO = new CadastroPO(driver);

    @Test
    public void teste1() {
        cadastroPO.escreverNome("João da Silva");
        //cadastroPO.escreverCpf("12345678900");

        assertEquals("João da Silva", cadastroPO.obterNome());
    }
}

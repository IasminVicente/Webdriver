package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.LoginformPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before // tudo que eu quero mudar antes da execução do teste
    public void setUp(){
        navegador = Web.createChrome();

    }
    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsuario(){
        new LoginPage(navegador)
                .clicarSignIn()
                .Fazerlogin("julio0001", "123456")
                .clicarMe();

    }

    @After //tudo que for depois da execução do teste, como fechar o chrome
    public void  tearDown(){
        navegador.quit();
    }

}

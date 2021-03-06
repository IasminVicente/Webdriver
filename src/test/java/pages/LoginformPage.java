package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginformPage extends  BasePage{

    public LoginformPage(WebDriver navegador) {
        super(navegador);
    }

    //MODELO ESTRUTURADO:
    public LoginformPage digitarLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys( login);
        return this;
    }

    public LoginformPage digitarSenha (String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }
    public SecretaPage clicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);

    }//MODELO FUNCIONAL:
    public SecretaPage Fazerlogin(String login, String senha){
        digitarLogin(login);
        digitarSenha(senha);
        clicarSignIn();

        return new SecretaPage(navegador);
    }

}

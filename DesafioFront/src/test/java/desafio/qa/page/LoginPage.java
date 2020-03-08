package desafio.qa.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

public class LoginPage extends CorePage<LoginPage> {
	
	protected WebDriver driver;
	public LoginPage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/section[1]/label[2]/input")
	private WebElement inputLogin;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/section[2]/label[2]/input")
	private WebElement inputSenha;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/footer/button")
	private WebElement botaoEntrar;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/form/input[1]")
	private WebElement botaoSair;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/form/input[1]")
	private WebElement btnSair;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/section[1]/font/label")
	private WebElement labelCredenciaisInvalida;
	
	//METODOS
	
	public void acessarSistema() {
		preencherCampo(inputLogin, "admin");
		preencherCampo(inputSenha, "admin");
		click(botaoEntrar);
	}
	
	public void sairSistema() {
		aguardarElemento(btnSair);
		click(btnSair);
	}
	
	public void acessarSistemaDadosInvalidos(String text) {
		preencherCampo(inputLogin, "root");
		preencherCampo(inputSenha, "ttt");
		click(botaoEntrar);
		Assert.assertEquals(text, labelCredenciaisInvalida.getText());
	}
}

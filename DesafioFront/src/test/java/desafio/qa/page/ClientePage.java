package desafio.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

public class ClientePage extends CorePage<ClientePage> {
	
protected WebDriver driver;
	
	public ClientePage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(id = "nome")
	private WebElement nome;
	
	@FindBy(id = "cpf")
	private WebElement cpf;
	
	@FindBy(id = "status")
	private WebElement status;
	
	@FindBy(id = "saldoCliente")
	private WebElement saldoCliente;
		
	@FindBy(xpath = "//*[@id=\"formListarCliente\"]/div/fieldset/div/div/div[1]/input")
	private WebElement filtroNome;
	
	@FindBy(id = "calendario_input")
	private WebElement filtroCalendario;
	
	@FindBy(xpath = "//*[@id=\"alertMessage\"]/strong")
	private WebElement alertaClienteSalvo;
	
	@FindBy(xpath = "//*[@id=\"formListarCliente\"]/div/div/table/tbody/tr[1]/td[5]/a[1]")
	private WebElement btnVisualizarCliente;
	
	@FindBy(xpath = "//*[@id=\"formIncluirAlterarCliente\"]/div/div/div/div/div/a")
	private WebElement btnCancelar;
	
	@FindBy(xpath = "//*[@id=\"formListarCliente\"]/div/fieldset/div/div/div[3]/input")
	private WebElement btnPesquisar; 
	
	@FindBy(xpath = "//*[@id=\"formIncluirAlterarCliente\"]/div/div/div/div/div/a[1]")
	private WebElement btnAlterar;
	
	//METODOS

	public void preencherFormularioClienteValido() {
		aguardarElementoVisivel(nome);
		preencherCampo(nome, "Vanessa");
		aguardarElementoVisivel(cpf);
		preencherCampo(cpf, "28638499051");
		aguardarElementoVisivel(saldoCliente);
		preencherCampo(saldoCliente, "500.00");
		btnSalvar();
	}
	
	public void preencherFormularioClienteCpfInvalido() {
		aguardarElementoVisivel(nome);
		preencherCampo(nome, "Vanessa");
		aguardarElementoVisivel(cpf);
		preencherCampo(cpf, "00000000000");
		aguardarElementoVisivel(saldoCliente);
		preencherCampo(saldoCliente, "500.00");
		btnSalvar();
	}
	
	
	public void visualizarCliente() {
		aguardarElementoVisivel(filtroNome);
		preencherCampo(filtroNome, "Vanessa");
		btnPesquisar();
		aguardarElemento(btnVisualizarCliente);
		click(btnVisualizarCliente);
	}
	
	public void filtarClienteInvalido() {
		aguardarElementoVisivel(filtroNome);
		preencherCampo(filtroNome, "Roll");
		btnPesquisar();
		aguardarElemento(btnVisualizarCliente);
		click(btnVisualizarCliente);
	}
	
	public void listarCliente() {
		aguardarElementoVisivel(filtroNome);
		preencherCampo(filtroNome, "Vanessa");
		btnPesquisar();
	}
	
	public void btnPesquisar() {
		aguardarElementoVisivel(btnPesquisar);
		btnPesquisar.click();
	}
}

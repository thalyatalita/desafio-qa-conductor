package desafio.qa.menu.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

public class MenuPage extends CorePage<MenuPage>{
	
	protected WebDriver driver;
	
	public MenuPage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/a")
	private WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/a/span")
	private WebElement menuCliente;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/ul/li[2]/a/span")
	private WebElement listarCliente;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/ul/li[1]/a/span")
	private WebElement incluirCliente;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/a/span")
	private WebElement menuTransacao;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/ul/li[1]/a/span")
	private WebElement incluirVenda;
	
	@FindBy(xpath = "//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/ul/li[2]/a/span")
	private WebElement listarVenda;
	
	/** M�todo para o Menu de clientes */
	public void acessarMenuCliente() {
		aguardarElemento(menu);
		moverCursorPara(menu);
		aguardarElemento(menuCliente);
		moverCursorPara(menuCliente);	
	}
	
	/** M�todos para os sub menu de clientes */
	public void acessarSubMenuIncluirCliente() {
		aguardarElementoVisivel(incluirCliente);
		click(incluirCliente);
	}
	
	public void acessarSubMenuListarCliente() {
		aguardarElementoVisivel(listarCliente);
		click(listarCliente);
	}
	
	
	/** M�todo para o menu de Vendas */
	public void acessarMenuVendas() {
		aguardarElemento(menu);
		moverCursorPara(menu);
		aguardarElemento(menuTransacao);
		moverCursorPara(menuTransacao);
	}
	
	/** M�todos para os subMenu de vendas */
	public void acessarSubMenuIncluirVenda() {
		aguardarElementoVisivel(incluirVenda);
		click(incluirVenda);
	}
	
	public void acessarSubMenuListarVendas() {
		aguardarElementoVisivel(listarVenda);
		click(listarVenda);
	}
	
}

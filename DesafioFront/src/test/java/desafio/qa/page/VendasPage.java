package desafio.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

public class VendasPage extends CorePage<VendasPage> {
	
	protected WebDriver driver;
	
	public VendasPage () {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(id = "valorTransacao")
	private WebElement valorTransacao;
	
	@FindBy(id = "cliente")
	private WebElement selectCliente;
	
	@FindBy(xpath = "//*[@id=\"cliente\"]/option[2]")
	private WebElement optionCliente;
	
	@FindBy(xpath = "//*[@id=\"alertMessage\"]/strong")
	private WebElement alertInclusao;
	
    @FindBy(xpath = "//*[@id=\"formListarTransacao\"]/div/div/fieldset[2]/div/div/div/input")
    private WebElement btnPesquisar;
    
    @FindBy(xpath = "//*[@id=\"formListarTransacao\"]/div/div/div/table/tbody/tr[1]/td[5]/a")
    private WebElement btnVisualizar;
    
    //METODOS
    
    public void incluirTransacaoIgualAoValorCliente() {
		aguardarElementoVisivel(selectCliente);
		click(selectCliente);
		aguardarElementoVisivel(optionCliente);
		click(optionCliente);
		aguardarElementoVisivel(valorTransacao);
		preencherCampo(valorTransacao, "500.00");
		btnSalvar();
	}
    
    public void incluirTransacaoValorMaiorCliente() {
		aguardarElementoVisivel(selectCliente);
		click(selectCliente);
		aguardarElementoVisivel(optionCliente);
		click(optionCliente);
		aguardarElementoVisivel(valorTransacao);
		preencherCampo(valorTransacao, "900.00");
		btnSalvar();
	}
    
    public void incluirTransacaoValorMenorCliente() {
		aguardarElementoVisivel(selectCliente);
		click(selectCliente);
		aguardarElementoVisivel(optionCliente);
		click(optionCliente);
		aguardarElementoVisivel(valorTransacao);
		preencherCampo(valorTransacao, "50.00");
		btnSalvar();
	}
    
    public void listarVenda() {
		aguardarElementoVisivel(btnPesquisar);
		click(btnPesquisar);
	}
	
    public void visualizarVenda() {
    	aguardarElementoVisivel(btnPesquisar);
		click(btnPesquisar);
    	aguardarElemento(btnVisualizar);
    	click(btnVisualizar);
    }
	
    
}

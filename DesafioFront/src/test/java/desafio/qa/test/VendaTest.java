package desafio.qa.test;

import org.junit.Test;

import desafio.qa.core.CoreBaseTest;
import desafio.qa.menu.page.MenuPage;
import desafio.qa.page.LoginPage;
import desafio.qa.page.VendasPage;
import desafio.qa.util.Property;

public class VendaTest extends CoreBaseTest {
	
	/**
	 * Caso de teste responsável por incluir uma venda com saldo igual do cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu transacoes
	 * 3  - Acessa o submenu incluir 
	 * 4  - Preenche Valor Transacao
	 * 5  - Clicar em salvar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void incluirTransacaoIgualClienteTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		VendasPage vendaPage = new VendasPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuVendas();
		menuPage.acessarSubMenuIncluirVenda();
		
		vendaPage.incluirTransacaoIgualAoValorCliente();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por incluir uma venda com saldo maior que o cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu transacões
	 * 3  - Acessa o submenu incluir 
	 * 4  - Preenche Valor Transacao
	 * 5  - Clicar em salvar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void incluirTransacaoMaiorClienteTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		VendasPage vendaPage = new VendasPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuVendas();
		menuPage.acessarSubMenuIncluirVenda();
		
		vendaPage.incluirTransacaoValorMaiorCliente();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por incluir uma venda com saldo menor que o cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu transacões
	 * 3  - Acessa o submenu incluir 
	 * 4  - Preenche Valor Transacao
	 * 5  - Clicar em salvar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void incluirTransacaoMenorClienteTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		VendasPage vendaPage = new VendasPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuVendas();
		menuPage.acessarSubMenuIncluirVenda();
		
		vendaPage.incluirTransacaoValorMenorCliente();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por listar transações.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu transacões
	 * 3  - Acessa o submenu listar 
	 * 4  - Clicar em pesquisar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void listarTransacaoTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		VendasPage vendaPage = new VendasPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuVendas();
		menuPage.acessarSubMenuListarVendas();
		
		vendaPage.listarVenda();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por visualizar transações.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu transacões
	 * 3  - Acessa o submenu listar 
	 * 4  - Clicar em pesquisar
	 * 5  - Clicar no icone de visualizar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void visualizarTransacaoTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		VendasPage vendaPage = new VendasPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuVendas();
		menuPage.acessarSubMenuListarVendas();
		
		vendaPage.visualizarVenda();
		
		loginPage.sairSistema();
		
	}
	
}

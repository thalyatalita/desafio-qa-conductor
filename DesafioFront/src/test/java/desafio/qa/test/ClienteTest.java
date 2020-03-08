package desafio.qa.test;

import org.junit.Test;
import desafio.qa.core.CoreBaseTest;
import desafio.qa.menu.page.MenuPage;
import desafio.qa.page.ClientePage;
import desafio.qa.page.LoginPage;
import desafio.qa.util.Property;

public class ClienteTest extends CoreBaseTest {
	
	/**
	 * Caso de teste responsável por realizar cadastro de um cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu cliente
	 * 3  - Acessa o submenu incluir 
	 * 4  - Preenche todos os campos
	 * 5  - Clicar em salvar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void cadastrarClienteTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		ClientePage clientePage = new ClientePage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuCliente();
		menuPage.acessarSubMenuIncluirCliente();
		
		clientePage.preencherFormularioClienteValido();
		
		loginPage.sairSistema();
		
	}
	/**
	 * Caso de teste responsável por realizar cadastro de um cliente com CPF invalido.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu cliente
	 * 3  - Acessa o submenu incluir 
	 * 4  - Preenche todos os campos
	 * 5  - Preenche com CPF invalido
	 * 5  - Clicar em salvar
	 * 6  -  Realiza logout
	 * </pre>
	 */
	@Test
	public void cadastrarClienteCpfInvalidoTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		ClientePage clientePage = new ClientePage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuCliente();
		menuPage.acessarSubMenuIncluirCliente();
		
		clientePage.preencherFormularioClienteCpfInvalido();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por visualizar cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu cliente
	 * 3  - Acessa o submenu listar 
	 * 4  - Preenche campo de filtro nome
	 * 5  - Clicar em pesquisar
	 * 6  - Clicar em visualizar
	 * 6  - Realiza logout
	 * </pre>
	 */
	@Test
	public void visualizarPorClienteCadastradoTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		ClientePage clientePage = new ClientePage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuCliente();
		menuPage.acessarSubMenuListarCliente();
		
		clientePage.visualizarCliente();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por filtrar um cliente invalido.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu cliente
	 * 3  - Acessa o submenu listar 
	 * 4  - Preenche campo de filtro nome
	 * 5  - Clicar em pesquisar
	 * 6  - Clicar no icone de visualizar
	 * 7  - Realiza logout
	 * </pre>
	 */
	@Test
	public void filtarClienteInvalidoTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		ClientePage clientePage = new ClientePage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuCliente();
		menuPage.acessarSubMenuListarCliente();
		
		clientePage.filtarClienteInvalido();
		
		loginPage.sairSistema();
		
	}
	
	/**
	 * Caso de teste responsável por litar cliente.
	 * 
	 * <pre>
	 * 1  - Realiza o login
	 * 2  - Acessa o menu cliente
	 * 3  - Acessa o submenu listar 
	 * 4  - Preenche campo de filtro nome
	 * 5  - Clicar em pesquisar
	 * 6  - Valida 
	 * 7  - Realiza logout
	 * </pre>
	 */
	@Test
	public void listarClienteTest() {
		
		LoginPage loginPage = new LoginPage();
		MenuPage menuPage = new MenuPage();
		ClientePage clientePage = new ClientePage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
		menuPage.acessarMenuCliente();
		menuPage.acessarSubMenuListarCliente();
		
		clientePage.listarCliente();
		
		loginPage.sairSistema();
		
	}

}

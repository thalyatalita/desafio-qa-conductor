package desafio.qa.test;

import org.junit.Test;
import desafio.qa.core.CoreBaseTest;
import desafio.qa.page.LoginPage;
import desafio.qa.util.Property;

public class LoginTest extends CoreBaseTest {
	
	/**
	 * Caso de teste responsável por realizar login com sucesso.
	 * 
	 * <pre>
	 * 1  - Preenche campo login
	 * 2  - Preenche campo senha
	 * 3  - Clicar em entrar 
	 * 4  - Realiza logout
	 * </pre>
	 */
	@Test
	public void loginComSucessoTest() {
		
		LoginPage loginPage = new LoginPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistema();
		
	}
	
	/**
	 * Caso de teste responsável por realizar login dados invalidos.
	 * 
	 * <pre>
	 * 1  - Preenche campo login invalida
	 * 2  - Preenche campo senha invalida
	 * 3  - Clicar em entrar 
	 * 4  - Realiza logout
	 * </pre>
	 */
	@Test
	public void loginSemSucessoTest() {
		
		LoginPage loginPage = new LoginPage();
		
		driver.navigate().to(Property.URL);
		
		loginPage.acessarSistemaDadosInvalidos("Credenciais inválidas");
		
	}

}

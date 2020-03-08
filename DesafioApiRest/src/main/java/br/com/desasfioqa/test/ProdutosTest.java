package br.com.desasfioqa.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import br.com.desafioqa.rest.core.BaseTest;

public class ProdutosTest extends BaseTest {
	
	/** 
	 * Caso de teste responsável por realizar listagem de produtos. 
	 * 
	 * */
	@Test
	public void deveListarProdutos() {
		
		given()
			.header("Token","desafio")
			.body("{}")
		.when()
			.get("/produtos")
		.then()
			.log().all()
			.statusCode(200)
		;
	
	}
	
	/** 
	 * Caso de teste responsável por validar a quantidade de produtos existente na lista. 
	 * 
	 * */
	@Test
	public void deveVerificarQuantidadeDaListaProdutos() {
		
		given()
			.header("Token","desafio")
			.body("{}")
		.when()
			.get("/produtos")
		.then()
			.statusCode(200)
			.body("$", hasSize(50))
		;
	
	}
	
	/** 
	 * Caso de teste responsável por retornar um produto pelo ID . 
	 * 
	 * */
	@Test
	public void deveRetornarProdutoPorId() {
		
		given()
			.header("Token","desafio")
			.body("{}")
		.when()
			.get("/produtos")
		.then()
			.statusCode(200)
			.body("find{it.id == 1}.descricao", is(1))
		
		;
	
	}

}

package br.com.desafioqa.rest.core;

import io.restassured.http.ContentType;

public interface Contantes {
	
	String APP_BASE_URL = "http://52.191.254.38/desafio";
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 5000L;

}

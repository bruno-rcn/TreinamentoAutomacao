package br.ce.wcaquino;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextAreaAndField {
	
	private CampoTreinamentoPage page;
	
	@Before
	public void inicializa() {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
	}
	
	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void textFieldNome() throws InterruptedException {
		page.setNome("Primeiro nome");
		Thread.sleep(1000);
		Assert.assertEquals("Primeiro nome", page.verificarTextoNome());
	}
	
	@Test
	public void textFieldSobrenome() throws InterruptedException {
		page.setSobrenome("Ultimo nome");
		Thread.sleep(1000);
		Assert.assertEquals("Ultimo nome", page.verificarTextoSobrenome());
	}
	
	@Test
	public void textAreaSugestoes() throws InterruptedException {
		page.setTexto("Escrevendo \n texto \n pulando \n linha \n\n fim");
		Thread.sleep(1000);
		Assert.assertEquals("Escrevendo \n texto \n pulando \n linha \n\n fim", page.verificarTextoArea());
	}
	
}



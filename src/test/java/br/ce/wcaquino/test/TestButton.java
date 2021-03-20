package br.ce.wcaquino.test;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.core.DSL;

public class TestButton {

	private DSL dsl;
	
	@Test
	public void clicarBotao() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\TreinamentoAutomacao\\src\\main\\resources\\br\\ce\\wcaquino\\componentes.html");
		dsl = new DSL();
		dsl.clicarBotao("buttonSimple");
		Thread.sleep(1000);
		Assert.assertEquals("Obrigado!", dsl.obterValorDoCampo("buttonSimple"));
		killDriver();
	}
}

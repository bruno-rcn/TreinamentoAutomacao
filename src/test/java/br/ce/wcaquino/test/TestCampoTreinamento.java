package br.ce.wcaquino.test;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;
import org.junit.Test;

public class TestCampoTreinamento {

	@Test
	public void abrirBrownser() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\TreinamentoAutomacao\\src\\main\\resources\\br\\ce\\wcaquino\\componentes.html");
		Thread.sleep(1000);
		killDriver();
	}
}

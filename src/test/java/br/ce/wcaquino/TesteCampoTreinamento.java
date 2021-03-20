package br.ce.wcaquino;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;
import org.junit.Test;

public class TesteCampoTreinamento {

	@Test
	public void abrirBrownser() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		Thread.sleep(1000);
		killDriver();
	}
}

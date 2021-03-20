package br.ce.wcaquino;


import static br.ce.wcaquino.core.DriverFactory.killDriver;
import static br.ce.wcaquino.core.DriverFactory.getDriver;
import org.junit.Test;
import org.openqa.selenium.Alert;

import br.ce.wcaquino.core.DSL;

public class TestFrame {
	
	@Test
	public void clicarFrame() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		DSL dsl = new DSL();
		CampoTreinamentoPage page = new CampoTreinamentoPage();
		Thread.sleep(1000);
		page.entrarFrame();
		dsl.clicarBotao("frameButton");
		Thread.sleep(1000);
		Alert alerta = getDriver().switchTo().alert();
		alerta.accept();
		Thread.sleep(1000);
		page.sairFrame();
		killDriver();
	}

}

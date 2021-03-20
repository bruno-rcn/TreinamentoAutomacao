package br.ce.wcaquino;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRadioButtonAndCheckBox {
	
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
	public void radioButton() throws InterruptedException {
		page.radioSexoMasculino();
		Thread.sleep(1000);
		Assert.assertTrue(page.radioButtonSelected());
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		page.checkBoxCarne();
		Thread.sleep(1000);
		Assert.assertTrue(page.checkBoxSelected());
	}
	
}

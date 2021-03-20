package br.ce.wcaquino;


import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.ce.wcaquino.core.DSL;

public class TestComboSelect {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializa() {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		dsl = new DSL();
	}
	
	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void comboSelectEscolaridade() throws InterruptedException {
		dsl.clicarComboSelect("elementosForm:escolaridade", 1);
		Thread.sleep(1000);
		Assert.assertEquals("1graucomp", dsl.obterValorDoCombo("elementosForm:escolaridade"));
	}
	
	@Test
	public void comboSelectMultiplasOpcoesEsportes() throws InterruptedException {
		WebElement comboEsportes = driver.findElement(By.id("elementosForm:esportes"));
		Select selectEsportes = new Select(comboEsportes);
		selectEsportes.selectByIndex(0);
		selectEsportes.selectByIndex(2);
		selectEsportes.selectByIndex(4);
		Thread.sleep(1000);
		List<WebElement> allOptions = selectEsportes.getAllSelectedOptions();
		Assert.assertEquals(3, allOptions.size());
	}
}

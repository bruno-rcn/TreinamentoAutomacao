package br.ce.wcaquino;

import static br.ce.wcaquino.core.DriverFactory.killDriver;
import static br.ce.wcaquino.core.DriverFactory.getDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestLink {
	
	@Test
	public void linkVoltar() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		getDriver().findElement(By.linkText("Voltar")).click();
		Thread.sleep(1000);
		Assert.assertEquals("Voltou!", getDriver().findElement(By.id("resultado")).getText());
		killDriver();
	}

}

package br.ce.wcaquino.test;

import static br.ce.wcaquino.core.DriverFactory.killDriver;
import static br.ce.wcaquino.core.DriverFactory.getDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestLink {
	
	@Test
	public void linkVoltar() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\TreinamentoAutomacao\\src\\main\\resources\\br\\ce\\wcaquino\\componentes.html");
		getDriver().findElement(By.linkText("Voltar")).click();
		Thread.sleep(1000);
		Assert.assertEquals("Voltou!", getDriver().findElement(By.id("resultado")).getText());
		killDriver();
	}

}

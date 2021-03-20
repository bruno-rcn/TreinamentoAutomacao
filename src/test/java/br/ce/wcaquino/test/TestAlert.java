package br.ce.wcaquino.test;

import static br.ce.wcaquino.core.DriverFactory.getDriver;
import static br.ce.wcaquino.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import br.ce.wcaquino.core.DSL;

public class TestAlert {
	
	private DSL dsl;
	
	@Before
	public void inicializa() {
		getDriver().get("C:\\Projects - estudo\\TreinamentoAutomacao\\src\\main\\resources\\br\\ce\\wcaquino\\componentes.html");
		dsl = new DSL();
	}
	
	@After
	public void finaliza() {
		killDriver();
	}
	
	
	@Test
	public void acionarAlertSimples() throws InterruptedException {
		dsl.clicarBotao("alert");
		Alert alerta = getDriver().switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Alert Simples", alerta.getText());
	}
	
	@Test
	public void acionarAlertConfirmar() throws InterruptedException {
		getDriver().findElement(By.id("confirm")).click();
		Alert alerta = getDriver().switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Confirm Simples", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
		Assert.assertEquals("Confirmado", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
	}
	
	
	@Test
	public void acionarAlertNegar() throws InterruptedException {
		getDriver().findElement(By.id("confirm")).click();
		Alert alerta = getDriver().switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Confirm Simples", alerta.getText());
		alerta.dismiss();
		Thread.sleep(1000);
		Assert.assertEquals("Negado", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
	}
	
	@Test
	public void acionarAlertPrompt() throws InterruptedException {
		getDriver().findElement(By.id("prompt")).click();
		Alert alerta = getDriver().switchTo().alert();
		Assert.assertEquals("Digite um numero", alerta.getText());
		alerta.sendKeys("123");
		Thread.sleep(1000);
		alerta.accept();
		Thread.sleep(1000);
		Assert.assertEquals("Era 123?", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
		Assert.assertEquals(":D", alerta.getText());
	}

}

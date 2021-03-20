package br.ce.wcaquino;

import static br.ce.wcaquino.core.DriverFactory.killDriver;
import static br.ce.wcaquino.core.DriverFactory.getDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.ce.wcaquino.core.DSL;

public class TestCadastroUsuario {

	@Test
	public void cadastrarNovoUsuario() throws InterruptedException {
		getDriver().get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		DSL dsl = new DSL();
		CampoTreinamentoPage page = new CampoTreinamentoPage();
		Thread.sleep(1000);
		page.setNome("Nome");
		Thread.sleep(1000);
		page.setSobrenome("Sobrenome");
		Thread.sleep(1000);
		page.radioSexoMasculino();
		Thread.sleep(1000);
		page.checkBoxCarne();
		Thread.sleep(1000);
		dsl.clicarComboSelect("elementosForm:escolaridade", 4);
		Thread.sleep(1000);
		WebElement esportes = getDriver().findElement(By.id("elementosForm:esportes"));
		Select selectEsportes = new Select(esportes);
		selectEsportes.selectByIndex(1);
		selectEsportes.selectByIndex(2);
		selectEsportes.selectByIndex(3);
		Thread.sleep(1000);
		dsl.clicarBotao("elementosForm:cadastrar");
		Thread.sleep(1000);
		Assert.assertTrue(getDriver().findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertTrue(getDriver().findElement(By.id("descNome")).getText().endsWith("Nome"));
		Assert.assertEquals("Sobrenome: Sobrenome", getDriver().findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Masculino", getDriver().findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Carne", getDriver().findElement(By.id("descComida")).getText());
		Assert.assertEquals("Escolaridade: superior", getDriver().findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Futebol Corrida Karate", getDriver().findElement(By.id("descEsportes")).getText());
		killDriver();
	}
	
}

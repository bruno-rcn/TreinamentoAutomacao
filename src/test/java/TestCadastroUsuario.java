import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCadastroUsuario {

	@Test
	public void cadastrarNovoUsuario() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		DSL dsl = new DSL(driver);
		Thread.sleep(1000);
		dsl.escrever("elementosForm:nome", "Nome");
		Thread.sleep(1000);
		dsl.escrever("elementosForm:sobrenome", "Sobrenome");
		Thread.sleep(1000);
		dsl.clicarRadioButton("elementosForm:sexo");
		Thread.sleep(1000);
		dsl.clicarCheckBox("elementosForm:comidaFavorita");
		Thread.sleep(1000);
		dsl.clicarComboSelect("elementosForm:escolaridade", 4);
		Thread.sleep(1000);
		WebElement esportes = driver.findElement(By.id("elementosForm:esportes"));
		Select selectEsportes = new Select(esportes);
		selectEsportes.selectByIndex(1);
		selectEsportes.selectByIndex(2);
		selectEsportes.selectByIndex(3);
		Thread.sleep(1000);
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Nome"));
		Assert.assertEquals("Sobrenome: Sobrenome", driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Carne", driver.findElement(By.id("descComida")).getText());
		Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Futebol Corrida Karate", driver.findElement(By.id("descEsportes")).getText());
		driver.quit();
	}
	
}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		dsl = new DSL(driver);
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
	
	
	@Test
	public void acionarAlertSimples() throws InterruptedException {
		dsl.clicarBotao("alert");
		Alert alerta = driver.switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Alert Simples", alerta.getText());
	}
	
	@Test
	public void acionarAlertConfirmar() throws InterruptedException {
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
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
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
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
		driver.findElement(By.id("prompt")).click();
		Alert alerta = driver.switchTo().alert();
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

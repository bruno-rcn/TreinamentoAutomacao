import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	
	@Test
	public void acionarAlertSimples() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert")).click();
		Alert alerta = driver.switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Alert Simples", alerta.getText());
		driver.quit();
	}
	
	@Test
	public void acionarAlertConfirmar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Confirm Simples", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
		Assert.assertEquals("Confirmado", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test
	public void acionarAlertNegar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
		Thread.sleep(1000);
		Assert.assertEquals("Confirm Simples", alerta.getText());
		alerta.dismiss();
		Thread.sleep(1000);
		Assert.assertEquals("Negado", alerta.getText());
		alerta.accept();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void acionarAlertPrompt() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
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
		driver.quit();
	}

}

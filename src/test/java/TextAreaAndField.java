import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaAndField {

	@Test
	public void textFieldNome() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Primeiro nome");
		Thread.sleep(1000);
		Assert.assertEquals("Primeiro nome", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void textFieldSobrenome() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("elementosForm:sobrenome")).sendKeys("Ultimo nome");
		Thread.sleep(1000);
		Assert.assertEquals("Ultimo nome", driver.findElement(By.name("elementosForm:sobrenome")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void textAreaSugestoes() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Escrevendo \n texto \n pulando \n linha \n\n fim");
		Thread.sleep(1000);
		Assert.assertEquals("Escrevendo \n texto \n pulando \n linha \n\n fim", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.quit();
	}
	
}



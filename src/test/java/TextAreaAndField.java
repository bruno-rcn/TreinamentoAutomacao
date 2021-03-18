import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaAndField {
	
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
	public void textFieldNome() throws InterruptedException {
		dsl.escrever("elementosForm:nome", "Primeiro nome");
		Thread.sleep(1000);
		Assert.assertEquals("Primeiro nome", dsl.obterValorDoCampo("elementosForm:nome"));
	}
	
	@Test
	public void textFieldSobrenome() throws InterruptedException {
		driver.findElement(By.name("elementosForm:sobrenome")).sendKeys("Ultimo nome");
		Thread.sleep(1000);
		Assert.assertEquals("Ultimo nome", driver.findElement(By.name("elementosForm:sobrenome")).getAttribute("value"));
	}
	
	@Test
	public void textAreaSugestoes() throws InterruptedException {
		dsl.escrever("elementosForm:sugestoes", "Escrevendo \n texto \n pulando \n linha \n\n fim");
		Thread.sleep(1000);
		Assert.assertEquals("Escrevendo \n texto \n pulando \n linha \n\n fim", dsl.obterValorDoCampo("elementosForm:sugestoes"));
	}
	
}



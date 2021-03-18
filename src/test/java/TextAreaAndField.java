import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaAndField {
	
	private WebDriver driver;
	private CampoTreinamentoPage page;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		page = new CampoTreinamentoPage(driver);
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void textFieldNome() throws InterruptedException {
		page.setNome("Primeiro nome");
		Thread.sleep(1000);
		Assert.assertEquals("Primeiro nome", page.verificarTextoNome());
	}
	
	@Test
	public void textFieldSobrenome() throws InterruptedException {
		page.setSobrenome("Ultimo nome");
		Thread.sleep(1000);
		Assert.assertEquals("Ultimo nome", page.verificarTextoSobrenome());
	}
	
	@Test
	public void textAreaSugestoes() throws InterruptedException {
		page.setTexto("Escrevendo \n texto \n pulando \n linha \n\n fim");
		Thread.sleep(1000);
		Assert.assertEquals("Escrevendo \n texto \n pulando \n linha \n\n fim", page.verificarTextoArea());
	}
	
}



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtonAndCheckBox {
	
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
	public void radioButton() throws InterruptedException {
		page.radioSexoMasculino();
		Thread.sleep(1000);
		Assert.assertTrue(page.radioButtonSelected());
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		page.checkBoxCarne();
		Thread.sleep(1000);
		Assert.assertTrue(page.checkBoxSelected());
	}
	
}

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButton {

	private DSL dsl;
	
	@Test
	public void clicarBotao() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		dsl = new DSL(driver);
		dsl.clicarBotao("buttonSimple");
		Thread.sleep(1000);
		Assert.assertEquals("Obrigado!", dsl.obterValorDoCampo("buttonSimple"));
		driver.quit();
	}
}

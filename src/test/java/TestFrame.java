import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {
	
	@Test
	public void clicarFrame() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		DSL dsl = new DSL(driver);
		CampoTreinamentoPage page = new CampoTreinamentoPage(driver);
		Thread.sleep(1000);
		page.entrarFrame();
		dsl.clicarBotao("frameButton");
		Thread.sleep(1000);
		Alert alerta = driver.switchTo().alert();
		alerta.accept();
		Thread.sleep(1000);
		page.sairFrame();
		driver.quit();
	}

}

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestComboSelect {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void comboSelectEscolaridade() throws InterruptedException {
		WebElement comboEscolaridade = driver.findElement(By.id("elementosForm:escolaridade"));
		Select selectEscolaridade = new Select(comboEscolaridade);
		selectEscolaridade.selectByIndex(1);
		Thread.sleep(1000);
		Assert.assertEquals("1graucomp", driver.findElement(By.id("elementosForm:escolaridade")).getAttribute("value"));
	}
	
	@Test
	public void comboSelectMultiplasOpcoesEsportes() throws InterruptedException {
		WebElement comboEsportes = driver.findElement(By.id("elementosForm:esportes"));
		Select selectEsportes = new Select(comboEsportes);
		selectEsportes.selectByIndex(0);
		selectEsportes.selectByIndex(2);
		selectEsportes.selectByIndex(4);
		Thread.sleep(1000);
		List<WebElement> allOptions = selectEsportes.getAllSelectedOptions();
		Assert.assertEquals(3, allOptions.size());
	}
}

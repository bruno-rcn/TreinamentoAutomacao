import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestComboSelect {

	@Test
	public void comboSelectEscolaridade() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		WebElement comboEscolaridade = driver.findElement(By.id("elementosForm:escolaridade"));
		Select selectEscolaridade = new Select(comboEscolaridade);
		selectEscolaridade.selectByIndex(1);
		Thread.sleep(1000);
		Assert.assertEquals("1graucomp", driver.findElement(By.id("elementosForm:escolaridade")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void comboSelectMultiplasOpcoesEsportes() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		WebElement comboEsportes = driver.findElement(By.id("elementosForm:esportes"));
		Select selectEsportes = new Select(comboEsportes);
		selectEsportes.selectByIndex(0);
		selectEsportes.selectByIndex(2);
		selectEsportes.selectByIndex(4);
		Thread.sleep(1000);
		List<WebElement> allOptions = selectEsportes.getAllSelectedOptions();
		Assert.assertEquals(3, allOptions.size());
		driver.quit();
	}
	
	
}

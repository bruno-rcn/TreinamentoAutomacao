import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboSelect {

	@Test
	public void comboSelect() throws InterruptedException {
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
	
	
}

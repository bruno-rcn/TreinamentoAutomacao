import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButton {
	
	@Test
	public void radioButton() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		botao.click();
		Thread.sleep(1000);
		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
		driver.quit();
	}
}

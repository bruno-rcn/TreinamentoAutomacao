import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtonAndCheckBox {

	@Test
	public void radioButton() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("elementosForm:comidaFavorita")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.name("elementosForm:comidaFavorita")).isSelected());
		driver.quit();
		
	}
	
}

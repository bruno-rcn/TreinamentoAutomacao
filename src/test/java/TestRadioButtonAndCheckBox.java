import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtonAndCheckBox {
	
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
	public void radioButton() throws InterruptedException {
		dsl.clicarRadioButton("elementosForm:sexo:0");
		Thread.sleep(1000);
		Assert.assertTrue(dsl.isRadioSelected("elementosForm:sexo:0"));
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		driver.findElement(By.name("elementosForm:comidaFavorita")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.name("elementosForm:comidaFavorita")).isSelected());
	}
	
}

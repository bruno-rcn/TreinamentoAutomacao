import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {
	
	@Test
	public void clicarFrame() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Projects - estudo\\AutomacaoSeleniumPuro\\src\\main\\resources\\componentes.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("frameButton")).click();
		Thread.sleep(1000);
		Alert alerta = driver.switchTo().alert();
		alerta.accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}

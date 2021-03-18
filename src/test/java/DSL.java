import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	public void escrever(String id, String texto) {
		driver.findElement(By.id(id)).sendKeys(texto);
	}
	
	public String obterValorDoCampo(String id) {
		return driver.findElement(By.id(id)).getAttribute("value");
	}
	
	public void clicarRadioButton(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isRadioSelected(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	
	public void clicarCheckBox(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isCheckSelected(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	
	public void clicarComboSelect(String id, int index) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByIndex(index);
	}
	
	public String obterValorDoCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicarLink(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
}

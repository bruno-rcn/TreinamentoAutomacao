package br.ce.wcaquino.core;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	
	public void escrever(String id, String texto) {
		getDriver().findElement(By.id(id)).sendKeys(texto);
	}
	
	public String obterValorDoCampo(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}
	
	public void clicarRadioButton(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public boolean isRadioSelected(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}
	
	public void clicarCheckBox(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public boolean isCheckSelected(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}
	
	public void clicarComboSelect(String id, int index) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByIndex(index);
	}
	
	public String obterValorDoCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public void clicarLink(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	public void irParaframe(String id_frame) {
		getDriver().switchTo().frame(id_frame);
	}
	
	public void voltarParaTelaDefault() {
		getDriver().switchTo().defaultContent();
	}

}

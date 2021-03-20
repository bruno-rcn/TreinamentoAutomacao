package br.ce.wcaquino.page;


import br.ce.wcaquino.core.PageBase;

public class CampoTreinamentoPage extends PageBase {

	
	/*************** CAMPO DE TEXTO ***************/
	
	public void setNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("elementosForm:sobrenome", sobrenome);
	}
	
	public void setTexto(String texto) {
		dsl.escrever("elementosForm:sugestoes", texto);
	}
	
	public String verificarTextoNome() {
		return dsl.obterValorDoCampo("elementosForm:nome");
	}
	
	public String verificarTextoSobrenome() {
		return dsl.obterValorDoCampo("elementosForm:sobrenome");
	}
	
	public String verificarTextoArea() {
		return dsl.obterValorDoCampo("elementosForm:sugestoes");
	}
	
	/*************** Radio button and CheckBox ***************/
	
	public void radioSexoMasculino() {
		dsl.clicarRadioButton("elementosForm:sexo:0");
	}
	
	public void checkBoxCarne() {
		dsl.clicarCheckBox("elementosForm:comidaFavorita:0");
	}
	
	public boolean radioButtonSelected() {
		return dsl.isCheckSelected("elementosForm:sexo:0");
	}
	
	public boolean checkBoxSelected() {
		return dsl.isCheckSelected("elementosForm:comidaFavorita:0");
	}
	
	/*************** frame ***************/
	
	public void entrarFrame() {
		dsl.irParaframe("frame1");
	}
	
	public void sairFrame() {
		dsl.voltarParaTelaDefault();
	}
	
}

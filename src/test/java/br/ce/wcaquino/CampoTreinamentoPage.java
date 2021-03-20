package br.ce.wcaquino;


import br.ce.wcaquino.core.DSL;

public class CampoTreinamentoPage {
	
	private DSL dsl;
	
	public CampoTreinamentoPage() {
		dsl = new DSL();
	}
	
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
		return dsl.isCheckSelected("elementosForm:comidaFavorita");
	}
	
	/*************** frame ***************/
	
	public void entrarFrame() {
		dsl.irParaframe("frame1");
	}
	
	public void sairFrame() {
		dsl.voltarParaTelaDefault();
	}
	
}

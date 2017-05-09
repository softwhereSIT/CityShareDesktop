/*Classe respons�vel pelo controle da tela de relat�rio de funcion�rio*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelFuncionariosView;

public class RelFuncionarioController {
	RelFuncionariosView telaRelatorioFuncionario;
	
	/*Construtor da classe*/
	public RelFuncionarioController(RelFuncionariosView telaRelatorioFuncionario){
		this.telaRelatorioFuncionario = telaRelatorioFuncionario;
	}
	
	/*M�todo para abrir a janela de relat�rio de funcion�rio*/
	public void AbrirRelFuncionario(){
		telaRelatorioFuncionario.setVisible(true);
	}
	
	/*M�todo para fechar a janela de relat�rio de funcion�rio*/
	public void FecharRelFuncionario(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relat�rio de funcion�rio*/
    	telaRelatorioFuncionario.setVisible(false);
	}
}
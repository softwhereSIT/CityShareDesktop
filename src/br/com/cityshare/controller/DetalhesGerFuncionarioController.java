/*Classe respons�vel pelo controle da tela de detalhes da funcion�rio*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerFuncionarioView;

public class DetalhesGerFuncionarioController {
	DetalhesGerFuncionarioView telaDetalhesFuncionario;
	
	/*Construtor da classe*/
	public DetalhesGerFuncionarioController(DetalhesGerFuncionarioView telaDetalhesFuncionario){
		this.telaDetalhesFuncionario = telaDetalhesFuncionario;
	}
	
	/*M�todo para abrir a janela de detalhes de funcion�rio*/
	public void AbrirDetalhesGerFuncionario(){
		telaDetalhesFuncionario.setVisible(true);
	}
	
	/*M�todo para fechar a janela de detalhes da funcion�rio*/
	public void FecharDetalhesGerFuncionario(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de funcion�rio*/
    	telaDetalhesFuncionario.setVisible(false);
	}
}
/*Classe responsável pelo controle da tela de detalhes da funcionário*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerFuncionarioView;

public class DetalhesGerFuncionarioController {
	DetalhesGerFuncionarioView telaDetalhesFuncionario;
	
	/*Construtor da classe*/
	public DetalhesGerFuncionarioController(DetalhesGerFuncionarioView telaDetalhesFuncionario){
		this.telaDetalhesFuncionario = telaDetalhesFuncionario;
	}
	
	/*Método para abrir a janela de detalhes de funcionário*/
	public void AbrirDetalhesGerFuncionario(){
		telaDetalhesFuncionario.setVisible(true);
	}
	
	/*Método para fechar a janela de detalhes da funcionário*/
	public void FecharDetalhesGerFuncionario(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de funcionário*/
    	telaDetalhesFuncionario.setVisible(false);
	}
}
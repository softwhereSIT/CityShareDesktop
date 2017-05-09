/*Classe responsável pelo controle da tela de relatório de funcionário*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelFuncionariosView;

public class RelFuncionarioController {
	RelFuncionariosView telaRelatorioFuncionario;
	
	/*Construtor da classe*/
	public RelFuncionarioController(RelFuncionariosView telaRelatorioFuncionario){
		this.telaRelatorioFuncionario = telaRelatorioFuncionario;
	}
	
	/*Método para abrir a janela de relatório de funcionário*/
	public void AbrirRelFuncionario(){
		telaRelatorioFuncionario.setVisible(true);
	}
	
	/*Método para fechar a janela de relatório de funcionário*/
	public void FecharRelFuncionario(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relatório de funcionário*/
    	telaRelatorioFuncionario.setVisible(false);
	}
}
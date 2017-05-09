/*Classe responsável pelo controle da tela de relatório de veículos*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelVeiculosView;

public class RelVeiculoController {
	RelVeiculosView telaRelatorioVeiculo;
	
	/*Construtor da classe*/
	public RelVeiculoController(RelVeiculosView telaRelatorioVeiculo){
		this.telaRelatorioVeiculo = telaRelatorioVeiculo;
	}
	
	/*Método para abrir a janela de relatório de veículos*/
	public void AbrirRelVeiculo(){
		telaRelatorioVeiculo.setVisible(true);
	}
	
	/*Método para fechar a janela de relatório de veículos*/
	public void FecharRelVeiculo(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relatório de veículos*/
    	telaRelatorioVeiculo.setVisible(false);
	}
}
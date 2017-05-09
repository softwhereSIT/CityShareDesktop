/*Classe responsável pelo controle da tela de detalhes de veículo*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerVeiculoView;

public class DetalhesGerVeiculoController {
	DetalhesGerVeiculoView telaDetalhesVeiculo;
	
	/*Construtor da classe*/
	public DetalhesGerVeiculoController(DetalhesGerVeiculoView telaDetalhesVeiculo){
		this.telaDetalhesVeiculo = telaDetalhesVeiculo;
	}
	
	/*Método para abrir a janela de detalhes de veículo*/
	public void AbrirDetalhesGerVeiculo(){
		telaDetalhesVeiculo.setVisible(true);
	}
	
	/*Método para fechar a janela de detalhes de veículo*/
	public void FecharDetalhesGerVeiculo(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de veículo*/
    	telaDetalhesVeiculo.setVisible(false);
	}
}
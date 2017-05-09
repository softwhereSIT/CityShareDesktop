/*Classe respons�vel pelo controle da tela de detalhes de ve�culo*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerVeiculoView;

public class DetalhesGerVeiculoController {
	DetalhesGerVeiculoView telaDetalhesVeiculo;
	
	/*Construtor da classe*/
	public DetalhesGerVeiculoController(DetalhesGerVeiculoView telaDetalhesVeiculo){
		this.telaDetalhesVeiculo = telaDetalhesVeiculo;
	}
	
	/*M�todo para abrir a janela de detalhes de ve�culo*/
	public void AbrirDetalhesGerVeiculo(){
		telaDetalhesVeiculo.setVisible(true);
	}
	
	/*M�todo para fechar a janela de detalhes de ve�culo*/
	public void FecharDetalhesGerVeiculo(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de ve�culo*/
    	telaDetalhesVeiculo.setVisible(false);
	}
}
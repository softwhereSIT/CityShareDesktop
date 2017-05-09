/*Classe respons�vel pelo controle da tela de gerenciamento de veiculo*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerVeiculoView;

public class GerVeiculoController {
	GerVeiculoView telaVeiculo;
	
	/*Construtor da classe*/
	public GerVeiculoController(GerVeiculoView telaVeiculo){
		this.telaVeiculo = telaVeiculo;
	}
	
	/*M�todo para abrir a janela de gerenciamento de veiculo*/
	public void AbrirGerVeiculo(){
		telaVeiculo.setVisible(true);
	}
	
	/*M�todo para fechar a janela de gerenciamento de veiculo*/
	public void FecharGerVeiculo(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de ve�culo*/
    	telaVeiculo.setVisible(false);
	}
}
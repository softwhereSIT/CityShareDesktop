/*Classe respons�vel pelo controle da tela de relat�rio de ve�culos*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelVeiculosView;

public class RelVeiculoController {
	RelVeiculosView telaRelatorioVeiculo;
	
	/*Construtor da classe*/
	public RelVeiculoController(RelVeiculosView telaRelatorioVeiculo){
		this.telaRelatorioVeiculo = telaRelatorioVeiculo;
	}
	
	/*M�todo para abrir a janela de relat�rio de ve�culos*/
	public void AbrirRelVeiculo(){
		telaRelatorioVeiculo.setVisible(true);
	}
	
	/*M�todo para fechar a janela de relat�rio de ve�culos*/
	public void FecharRelVeiculo(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relat�rio de ve�culos*/
    	telaRelatorioVeiculo.setVisible(false);
	}
}
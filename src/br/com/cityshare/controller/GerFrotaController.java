/*Classe respons�vel pelo controle da tela de gerenciamento de frota*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerFrotaView;

public class GerFrotaController {
	GerFrotaView telaFrota;
	
	/*Construtor da classe*/
	public GerFrotaController(GerFrotaView telaFrota){
		this.telaFrota = telaFrota;
	}
	
	/*M�todo para abrir a janela de gerenciamento de frota*/
	public void AbrirGerFrota(){
		telaFrota.setVisible(true);
	}
	
	/*M�todo para fechar a janela de gerenciamento de frota*/
	public void FecharGerFrota(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de frota*/
    	telaFrota.setVisible(false);
	}
}
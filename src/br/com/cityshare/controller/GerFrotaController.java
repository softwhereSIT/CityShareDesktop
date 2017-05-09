/*Classe responsável pelo controle da tela de gerenciamento de frota*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerFrotaView;

public class GerFrotaController {
	GerFrotaView telaFrota;
	
	/*Construtor da classe*/
	public GerFrotaController(GerFrotaView telaFrota){
		this.telaFrota = telaFrota;
	}
	
	/*Método para abrir a janela de gerenciamento de frota*/
	public void AbrirGerFrota(){
		telaFrota.setVisible(true);
	}
	
	/*Método para fechar a janela de gerenciamento de frota*/
	public void FecharGerFrota(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de frota*/
    	telaFrota.setVisible(false);
	}
}
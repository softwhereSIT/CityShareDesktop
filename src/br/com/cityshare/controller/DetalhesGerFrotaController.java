/*Classe responsável pelo controle da tela de detalhes da frota*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerFrotaView;

public class DetalhesGerFrotaController {
	DetalhesGerFrotaView telaDetalhesFrota;
	
	/*Construtor da classe*/
	public DetalhesGerFrotaController(DetalhesGerFrotaView telaDetalhesFrota){
		this.telaDetalhesFrota = telaDetalhesFrota;
	}
	
	/*Método para abrir a janela de detalhes da frota*/
	public void AbrirDetalhesGerFrota(){
		telaDetalhesFrota.setVisible(true);
	}
	
	/*Método para fechar a janela de detalhes da frota*/
	public void FecharDetalhesGerFrota(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de frota*/
    	telaDetalhesFrota.setVisible(false);
	}
}
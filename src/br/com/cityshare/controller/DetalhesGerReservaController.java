/*Classe respons�vel pelo controle da tela de detalhes de resevas*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerReservaView;

public class DetalhesGerReservaController {
	DetalhesGerReservaView telaDetalhesRelatorio;
	
	/*Construtor da classe*/
	public DetalhesGerReservaController(DetalhesGerReservaView telaDetalhesRelatorio){
		this.telaDetalhesRelatorio = telaDetalhesRelatorio; 
	}
	
	/*M�todo para abrir a janela de detalhes de reservas*/
	public void AbrirDetalhesGerReserva(){
		telaDetalhesRelatorio.setVisible(true);
	}
	
	/*M�todo para fechar a janela de detalhes de reservas*/
	public void FecharDetalhesGerReserva(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de reservas*/
    	telaDetalhesRelatorio.setVisible(false);
	}
}
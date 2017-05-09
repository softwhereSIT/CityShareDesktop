/*Classe responsável pelo controle da tela de detalhes de resevas*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerReservaView;

public class DetalhesGerReservaController {
	DetalhesGerReservaView telaDetalhesRelatorio;
	
	/*Construtor da classe*/
	public DetalhesGerReservaController(DetalhesGerReservaView telaDetalhesRelatorio){
		this.telaDetalhesRelatorio = telaDetalhesRelatorio; 
	}
	
	/*Método para abrir a janela de detalhes de reservas*/
	public void AbrirDetalhesGerReserva(){
		telaDetalhesRelatorio.setVisible(true);
	}
	
	/*Método para fechar a janela de detalhes de reservas*/
	public void FecharDetalhesGerReserva(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes de reservas*/
    	telaDetalhesRelatorio.setVisible(false);
	}
}
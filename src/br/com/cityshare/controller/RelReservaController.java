/*Classe respons�vel pelo controle da tela de relat�rio de reservas*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelReservasView;

public class RelReservaController {
	RelReservasView telaRelatorioReserva;
	
	/*Construtor da classe*/
	public RelReservaController(RelReservasView telaRelatorioReserva){
		this.telaRelatorioReserva = telaRelatorioReserva;
	}
	
	/*M�todo para abrir a janela de relat�rio de reserva*/
	public void AbrirRelReserva(){
		telaRelatorioReserva.setVisible(true);
	}
	
	/*M�todo para fechar a janela de relat�rio de reserva*/
	public void FecharRelReserva(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relat�rio de reserva*/
    	telaRelatorioReserva.setVisible(false);
	}
}
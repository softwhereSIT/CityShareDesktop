/*Classe responsável pelo controle da tela de relatório de reservas*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelReservasView;

public class RelReservaController {
	RelReservasView telaRelatorioReserva;
	
	/*Construtor da classe*/
	public RelReservaController(RelReservasView telaRelatorioReserva){
		this.telaRelatorioReserva = telaRelatorioReserva;
	}
	
	/*Método para abrir a janela de relatório de reserva*/
	public void AbrirRelReserva(){
		telaRelatorioReserva.setVisible(true);
	}
	
	/*Método para fechar a janela de relatório de reserva*/
	public void FecharRelReserva(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relatório de reserva*/
    	telaRelatorioReserva.setVisible(false);
	}
}
/*Classe responsável pelo controle da tela de gerenciamento de reserva*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerReservaView;

public class GerReservaController {
	GerReservaView telaReserva;
	
	/*Construtor da classe*/
	public GerReservaController(GerReservaView telaReserva){
		this.telaReserva = telaReserva;
	}
	
	/*Método para abrir a janela de gerenciamento de reserva*/
	public void AbrirGerReserva(){
		telaReserva.setVisible(true);
	}
	
	/*Método para fechar a janela de gerenciamento de reserva*/
	public void FecharGerReserva(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de reserva*/
    	telaReserva.setVisible(false);
	}
}
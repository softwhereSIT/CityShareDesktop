/*Classe responsável pelo controle da tela de relatório de cliente*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelClientesView;

public class RelClienteController {
	RelClientesView telaRelatorioCliente;
	
	/*Construtor da classe*/
	public RelClienteController(RelClientesView telaRelatorioCliente){
		this.telaRelatorioCliente = telaRelatorioCliente;
	}
	
	/*Método para abrir a janela de relatório de cliente*/
	public void AbrirRelCliente(){
		telaRelatorioCliente.setVisible(true);
	}
	
	/*Método para fechar a janela de relatório de cliente*/
	public void FecharRelCliente(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relatório de cliente*/
    	telaRelatorioCliente.setVisible(false);
	}
}
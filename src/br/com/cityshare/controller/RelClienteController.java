/*Classe respons�vel pelo controle da tela de relat�rio de cliente*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.RelClientesView;

public class RelClienteController {
	RelClientesView telaRelatorioCliente;
	
	/*Construtor da classe*/
	public RelClienteController(RelClientesView telaRelatorioCliente){
		this.telaRelatorioCliente = telaRelatorioCliente;
	}
	
	/*M�todo para abrir a janela de relat�rio de cliente*/
	public void AbrirRelCliente(){
		telaRelatorioCliente.setVisible(true);
	}
	
	/*M�todo para fechar a janela de relat�rio de cliente*/
	public void FecharRelCliente(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de relat�rio de cliente*/
    	telaRelatorioCliente.setVisible(false);
	}
}
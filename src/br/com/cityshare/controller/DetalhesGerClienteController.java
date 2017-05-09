/*Classe responsável pelo controle da tela de detalhes do cliente*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.DetalhesGerClienteView;

public class DetalhesGerClienteController {
	DetalhesGerClienteView telaDetalhesCliente;
	
	/*Construtor da classe*/
	public DetalhesGerClienteController(DetalhesGerClienteView telaDetalhesCliente){
		this.telaDetalhesCliente = telaDetalhesCliente;
	}
	
	/*Método para abrir a janela de detalhes do cliente*/
	public void AbrirDetalhesGerCliente(){
		telaDetalhesCliente.setVisible(true);
	}
	
	/*Método para fechar a janela de detalhes do cliente*/
	public void FecharDetalhesGerCliente(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de detalhes do cliente*/
    	telaDetalhesCliente.setVisible(false);
	}
}
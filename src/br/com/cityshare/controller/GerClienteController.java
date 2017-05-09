/*Classe responsável por controllar a GerClienteView*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerClienteView;

public class GerClienteController {
	GerClienteView telaCliente;
	
	/*Construtor da classe*/
	public GerClienteController(GerClienteView telaCliente){
		this.telaCliente = telaCliente;
	}
	
    /*Método responsável por abrir a janela GerClienteView*/
    public void AbrirGerCliente(){
    	telaCliente.setVisible(true);
    }
            
    /*Método responsável por fechar a janela GerClienteView*/
    public void FecharGerCliente(){
    	/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de cliente*/
    	telaCliente.setVisible(false);
    }
}
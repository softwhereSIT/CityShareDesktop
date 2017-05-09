/*Classe respons�vel por controlar a PrincipalView*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.LoginView;
import br.com.cityshare.view.PrincipalView;

public class PrincipalController {
	PrincipalView telaPrincipal;
	
	/*Construtor da classe*/
	public PrincipalController(PrincipalView telaPrincipal){
		this.telaPrincipal = telaPrincipal;
	}
	
    /*M�todo para abrir a janela Principal*/
    public void AbrirPrincipal(){
        telaPrincipal.setVisible(true);
    }
    
    /*M�todo para fechar a janela Principal*/
    public void FecharPrincipal(){
        /*Encerra a conex�o com o banco de dados*/
        FabricaConexao.Fechar_banco();
        
        /*Fecha a view da janela principal*/
        telaPrincipal.setVisible(false);
        
        /*Em seguida, abre a tela de login do sistema*/
        LoginController telaLogin = new LoginController(new LoginView());
        telaLogin.AbrirLogin();    
    }   
}
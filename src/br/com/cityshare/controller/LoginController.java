/*Classe responsável por controlar a tela de login e seus métodos*/
package br.com.cityshare.controller;

import javax.swing.JOptionPane;

import br.com.cityshare.dao.ClienteDao;
import br.com.cityshare.view.LoginView;
import br.com.cityshare.view.PrincipalView;

public class LoginController {
	LoginView telaLogin;
	
	/*Construtor da classe*/
	public LoginController(LoginView telaLogin){
		this.telaLogin = telaLogin;
	}
	
	/*Método para abrir a janela de login*/
    public void AbrirLogin(){
        telaLogin.setVisible(true);
    }
    
    /*Método para fechar a janela de login*/
    public void FecharLogin(){
        telaLogin.setVisible(false);
    }
    
    /*Método para chamar a verificação de usuario no banco de acrdo com os parâmetros*/
    public void Verificacao(String email, String senha){
    	ClienteDao dao = new ClienteDao();
    	
    	if(dao.VerificarLogin(email, senha)){
    		/*Instanciamos um novo objeto da classe PrincipalView e o tornamos vísivel*/
    		PrincipalView telaPrincipal = new PrincipalView();
    		telaPrincipal.setVisible(true);
    		
    		/*fechamos a tela de login*/
    		telaLogin.setVisible(false);
    	}else{
    		if(email=="" || senha=="" || email.equals(null) || senha.equals(null)){
    			JOptionPane.showMessageDialog(telaLogin, "Usuário e/ou senha em branco!");
    		}else{
    			JOptionPane.showMessageDialog(telaLogin, "Usuário e/ou senha incorreto!");
    		}    		
    	}
    }
}
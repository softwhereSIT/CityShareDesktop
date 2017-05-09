/*Classe respons�vel por controlar a tela de login e seus m�todos*/
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
	
	/*M�todo para abrir a janela de login*/
    public void AbrirLogin(){
        telaLogin.setVisible(true);
    }
    
    /*M�todo para fechar a janela de login*/
    public void FecharLogin(){
        telaLogin.setVisible(false);
    }
    
    /*M�todo para chamar a verifica��o de usuario no banco de acrdo com os par�metros*/
    public void Verificacao(String email, String senha){
    	ClienteDao dao = new ClienteDao();
    	
    	if(dao.VerificarLogin(email, senha)){
    		/*Instanciamos um novo objeto da classe PrincipalView e o tornamos v�sivel*/
    		PrincipalView telaPrincipal = new PrincipalView();
    		telaPrincipal.setVisible(true);
    		
    		/*fechamos a tela de login*/
    		telaLogin.setVisible(false);
    	}else{
    		if(email=="" || senha=="" || email.equals(null) || senha.equals(null)){
    			JOptionPane.showMessageDialog(telaLogin, "Usu�rio e/ou senha em branco!");
    		}else{
    			JOptionPane.showMessageDialog(telaLogin, "Usu�rio e/ou senha incorreto!");
    		}    		
    	}
    }
}
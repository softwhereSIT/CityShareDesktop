/*Classe principal, chama a tela de login como primeira*/
package br.com.cityshare.main;

import br.com.cityshare.controller.LoginController;
import br.com.cityshare.view.LoginView;

public class Main {
    public static void main(String[] args) {
        /*try/catch para estilização das páginas, como o Nimbus, Metal, etc*/
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        
        /*Instancia do objeto da classe LoginController, para chamar o método de exibição da tela de login*/
        LoginController telaLogin = new LoginController(new LoginView());
        telaLogin.AbrirLogin();
    }
}
/*Classe responsável por todas as validações de senha*/
package br.com.cityshare.components;

import javax.swing.JOptionPane;

public class ValidacaoSenha {
    
    /*Verifica a quantidade de caracteres no campo de senha, caso maior que o limite*/
    public boolean ValidarSenha(String senha){
        String mensagem = null;
        
        /*Verificação de caracteres maior que o permitido no BD*/
        if(senha.length()>16){
            mensagem = "Erro! Senha excedeu o limite de caracteres permitido";
            return false;
        }else if(senha==null || senha==""){
            mensagem = "Erro! Senha em branco!";
            return false;
        }        
        /*Caso apresente alguma das verificações, JOptionPane é preenchido com a string de mensagem*/
        JOptionPane.showMessageDialog(null, mensagem);
        
        return true;
    }
}
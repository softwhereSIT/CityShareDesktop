/*Classe responsável pelo controle da tela de gerenciamento de funcionário*/
package br.com.cityshare.controller;

import javax.swing.JOptionPane;

import br.com.cityshare.dao.CargoDao;
import br.com.cityshare.dao.FuncionarioDao;
import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.GerFuncionarioView;

public class GerFuncionarioController {
	GerFuncionarioView telaFuncionario;
	
	/*Construtor da classe*/
	public GerFuncionarioController(GerFuncionarioView telaFuncionario){
		this.telaFuncionario = telaFuncionario;
	}
	
	/*Método para abrir a janela de dgerenciamento de funcionário*/
	public void AbrirGerFuncionario(){
		telaFuncionario.setVisible(true);
	}
	
	/*Método para fechar a janela de dgerenciamento de funcionário*/
	public void FecharGerFuncionario(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de funcionário*/
    	telaFuncionario.setVisible(false);
	}
	
	/*Método para preencher o combobox de acordo com os dados vindos do banco*/
	public void PreencherCargos(){
		CargoDao dao = new CargoDao();
		dao.ListarCargos();
	}
	
	/*Método para verificar confirmação de e-mail*/
	public boolean ConfirmacaoEmail(String email, String confEmail){
		boolean verificar = false;
		
		if(email == confEmail){
			verificar = true;
		}else{
			JOptionPane.showMessageDialog(telaFuncionario, "E-mail não confere!");
		}
		return verificar;
	}
	
	/*Método para verificar confirmação de senha*/
	public boolean ConfirmacaoSenha(String senha, String confSenha){
		boolean verificar = false;
		
		if(senha == confSenha){
			verificar = true;
		}else{
			verificar = false;
			JOptionPane.showMessageDialog(telaFuncionario, "Senha não confere!");
		}
		return verificar;
	}
	
	/*Método para verificar se todos os campos estão preenchidos corretamente*/
	public boolean VerificarCampos(String nome, String rg, String cpf, String dtNasc, String dtAdm, String idCargo, String senha, String confSenha, String confEmail, String email){
		boolean verificar = false;
		
		/*Caso algum desses campos fique vazio*/
		if(nome.equals("") || rg.equals("") || cpf.equals("") || dtNasc.equals("") || dtAdm.equals("") || idCargo.equals("") || senha.equals("") || email.equals("")){
			verificar = false;
			JOptionPane.showMessageDialog(telaFuncionario, "Há campos em branco!");
		}else{
			verificar = true;
		}		
		return verificar;
	}
	
	/*Método para adicionar funcionário na base de dados*/
	public void InserirFuncionario(String nome, String rg, String cpf, String dtNasc, String dtAdm, String idCargo, String senha, String confSenha, String email, String confEmail){
		
		GerFuncionarioController func = new GerFuncionarioController(telaFuncionario);
		
		if(/*func.ConfirmacaoEmail(email, confEmail)==true && func.ConfirmacaoSenha(senha, confSenha)==true && */func.VerificarCampos(nome, idCargo, cpf, dtNasc, dtAdm, idCargo, senha, confSenha, confEmail, confEmail)){
			FuncionarioDao dao = new FuncionarioDao();
			dao.Inserir(nome, rg, cpf, dtNasc, dtAdm, idCargo, email, senha);
			
			JOptionPane.showMessageDialog(telaFuncionario, "Funcionário inserido com sucesso");
		}else{
			JOptionPane.showMessageDialog(telaFuncionario, "Erro ao inserir funcionário");
		}		
	}
	
	/*Método para editar funcionário na base de dados*/
	public void AtualizarFuncionario(){}
}
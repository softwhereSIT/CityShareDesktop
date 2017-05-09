/*Classe responsável pelo controle da tela de gerenciamento de funcionário*/
package br.com.cityshare.controller;

import br.com.cityshare.dao.CargoDao;
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
}
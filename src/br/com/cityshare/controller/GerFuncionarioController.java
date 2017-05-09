/*Classe respons�vel pelo controle da tela de gerenciamento de funcion�rio*/
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
	
	/*M�todo para abrir a janela de dgerenciamento de funcion�rio*/
	public void AbrirGerFuncionario(){
		telaFuncionario.setVisible(true);
	}
	
	/*M�todo para fechar a janela de dgerenciamento de funcion�rio*/
	public void FecharGerFuncionario(){
		/*Encerra a conex�o com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de gerenciamento de funcion�rio*/
    	telaFuncionario.setVisible(false);
	}
	
	/*M�todo para preencher o combobox de acordo com os dados vindos do banco*/
	public void PreencherCargos(){
		CargoDao dao = new CargoDao();
		dao.ListarCargos();
	}
}
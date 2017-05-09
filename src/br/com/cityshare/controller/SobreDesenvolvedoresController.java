/*Classe responsável pelo controle da tela de sobre os desenvolvedores*/
package br.com.cityshare.controller;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.view.SobreDesenvolvedoresView;

public class SobreDesenvolvedoresController {
	SobreDesenvolvedoresView telaSobreDev;
	
	/*Construtor da classe*/
	public SobreDesenvolvedoresController(SobreDesenvolvedoresView telaSobreDev){
		this.telaSobreDev = telaSobreDev;
	}
	
	/*Método para abrir a janela de sobre os desenvolvedores*/
	public void AbrirSobreDesenvolvedores(){
		telaSobreDev.setVisible(true);
	}
	
	/*Método para fechar a janela de sobre os desenvolvedores*/
	public void FecharSobreDesenvolvedores(){
		/*Encerra a conexão com o banco de dados*/
    	FabricaConexao.Fechar_banco();
    	
    	/*Fecha a view da janela de sobre os desenvolvedores*/
    	telaSobreDev.setVisible(false);
	}
}
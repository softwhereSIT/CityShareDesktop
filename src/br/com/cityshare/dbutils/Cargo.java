/*Classe respons�vel por estabelecer a forma como os objetos do tipo cargo dever�o ser*/
package br.com.cityshare.dbutils;

public class Cargo {
	/*Vari�veis da classe*/
	private int idCargo;
	private String descCargo;
	
	/*M�todos acessores da classe*/
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getDescCargo() {
		return descCargo;
	}
	public void setDescCargo(String descCargo) {
		this.descCargo = descCargo;
	}	
}
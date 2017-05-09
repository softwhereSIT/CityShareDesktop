/*Classe responsável por estabelecer a forma como os objetos do tipo cargo deverão ser*/
package br.com.cityshare.dbutils;

public class Cargo {
	/*Variáveis da classe*/
	private int idCargo;
	private String descCargo;
	
	/*Métodos acessores da classe*/
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
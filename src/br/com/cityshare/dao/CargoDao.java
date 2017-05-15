/*Classe responsável por manipular todos os dados referentes aos cargos*/
package br.com.cityshare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.model.Cargo;

public class CargoDao {
	Connection con = FabricaConexao.Conectar_banco();
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	/*Método para listar todos os cargos*/
	public ArrayList<Cargo> ListarCargos(){
		ArrayList<Cargo> lstCargo = new ArrayList<Cargo>();
		
		try{
			String sql = "CALL listarCargos();";
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			
			/*Populando a lista*/
			while(rs.next()){
				Cargo c = new Cargo();
				c.setIdCargo(rs.getInt("idCargos"));
				c.setDescCargo(rs.getString("cargo"));
				
				lstCargo.add(c);
			}
		}catch(SQLException e){
			// TODO Auto-generated catch block
            e.printStackTrace();
		}
		return lstCargo;
	}
}
package br.com.cityshare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.cityshare.dbutils.FabricaConexao;

public class ClienteDao {
	Connection con = FabricaConexao.Conectar_banco();
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	/*Método para cadastrar um cliente no banco*/
	public boolean Cadastrar(String nome, String telefone, String celular, String email, String senha, String nroCartao, 
			String cpf_cnpj, String bandeira, String cvv, String validade) throws ClassNotFoundException{
		boolean verificar = false;
		
		try {
			stm = con.prepareStatement("CALL cadastrarCliente(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
			
			stm.setString(1, nome);
	        stm.setString(2, telefone);
	        stm.setString(3, celular);
	        stm.setString(4, email);
	        stm.setString(5, senha);
	        stm.setString(6, nroCartao);
	        stm.setString(7, cpf_cnpj);
	        stm.setString(8, bandeira);
	        stm.setString(9, cvv);
	        stm.setString(10, validade);

	        rs = stm.executeQuery();
			
	        if(rs.next()){
	        	verificar = true;
	        	
	          	System.out.println(rs.getArray("idCliente"));
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
		return verificar;		
	}
	
	/*Método para selecionar todo os dados funcionáio logado*/
	public void ListarDados(){}
}
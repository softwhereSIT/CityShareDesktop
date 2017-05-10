/*Classe responsável pela manipulação de dados do funcionário*/
package br.com.cityshare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.cityshare.dbutils.FabricaConexao;

public class FuncionarioDao {
	Connection con = FabricaConexao.Conectar_banco();
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	/*Método para verificar login de cliente*/
	public boolean VerificarLogin(String email, String senha){
		boolean verificar = false;
        
        try{
            stm = con.prepareStatement("CALL verificarLoginJuridico(?, ?);");
            stm.setString(1, email);
            stm.setString(2, senha);
			
            rs = stm.executeQuery();
			
            if(rs.next()){
            	verificar = true;
            }
        }catch (SQLException ex){
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            FabricaConexao.Fechar_banco();
        }
        return verificar;
	}
	
	/*Método responsável por inserir um funcionário no banco*/
	public boolean Inserir(String nome, String rg, String cpf, String dtNasc, String dtAdm, String idCargo, String email, String senha){
		boolean verificar = false;
		
		try{
			stm = con.prepareStatement("CALL addFuncionario(?, ?, ?, ?, ?, ?, ?, ?);");
			
			stm.setString(1, nome);
	        stm.setString(2, rg);
	        stm.setString(3, cpf);
	        stm.setString(4, dtNasc);
	        stm.setString(5, dtAdm);
	        stm.setString(6, idCargo);
	        stm.setString(7, senha);
	        stm.setString(8, email);
	        
	        rs = stm.executeQuery();
	        
	        verificar = true;
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verificar;
	}
	
	/*Método para editar um funcionário de acordo com o id passado como parâmetro*/
	public void Edtitar(int id, String nome, String rg, String cpf, String dtNasc, String dtAdm, int idCargo, String email, String senha){
		
		/*try{			
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	/*Método para excluir os dados de um funcionário de acordo com id passado como parâmetro*/
	public void Excluir(int id){}
}
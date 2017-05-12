/*Classe respons�vel pela manipula��o de dados do funcion�rio*/
package br.com.cityshare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.cityshare.dbutils.FabricaConexao;
import br.com.cityshare.model.Funcionario;
 
public class FuncionarioDao {
	Connection con = FabricaConexao.Conectar_banco();
	PreparedStatement stm = null;
	ResultSet rs = null;
	Funcionario f = new Funcionario();
	
	/*M�todo para verificar login de cliente*/
	public boolean VerificarLogin(String email, String senha){
		boolean verificar = false;
        
        try{
            stm = con.prepareStatement("CALL verificarLoginJuridico(?, ?);");
            stm.setString(1, email);
            stm.setString(2, senha);
			
            rs = stm.executeQuery();
			
            if(rs.next()){
            	verificar = true;               	
            	
            	f.setIdFuncionario(rs.getInt("id_funcJuridico"));
            	f.setNome(rs.getString("nome"));
            	f.setDtNasc(rs.getString("dtNasc"));
            	f.setRg(rs.getString("rg"));
            	f.setCpf(rs.getString("cpf"));
            	f.setEmail(rs.getString("email"));
            	f.setSenha(rs.getString("senha"));
            	f.setIdCliente(rs.getInt("idCliente"));
            	f.setDtAdm(rs.getString("dtAdm"));
            	f.setIdCargo(rs.getInt("idCargo"));
            	
            	//System.out.println(f);
            }
        }catch (SQLException ex){
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            FabricaConexao.Fechar_banco();
        }
        return verificar;
	}
	
	/*M�todo respons�vel por inserir um funcion�rio no banco*/
	public boolean Inserir(String nome, String rg, String cpf, String dtNasc, String dtAdm, String idCargo, String email, String senha){
		boolean verificar = false;
		
		try{					
			/*Recuperando o id do cliente jur�dico de acordo com o funcion�rio logado no sistema*/
			String idCliente = f.getIdCliente()+""; 
			
			stm = con.prepareStatement("CALL addFuncionarioJuridico(?, ?, ?, ?, ?, ?, ?, ?, ?);");
			
			stm.setString(1, nome);
			stm.setString(2, dtNasc);
			stm.setString(3, rg);
			stm.setString(4, cpf);
			stm.setString(5, email);
			stm.setString(6, senha);
			stm.setString(7, idCliente);
			stm.setString(8, dtAdm);
			stm.setString(9, idCargo);
				        
	        rs = stm.executeQuery();
	        
	        verificar = true;
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verificar;
	}
	
	/*M�todo para editar um funcion�rio de acordo com o id passado como par�metro*/
	public void Edtitar(int id, String nome, String rg, String cpf, String dtNasc, String dtAdm, int idCargo, String email, String senha){
		
		/*try{			
			
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	/*M�todo para excluir os dados de um funcion�rio de acordo com id passado como par�metro*/
	public void Excluir(int id){}
}
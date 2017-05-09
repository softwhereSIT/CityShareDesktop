/*Classe responsável por realizar, verificar e encerrar a conexão com o banco de dados*/

package br.com.cityshare.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    static Connection con;

    /*Método que realiza a coneão com o banco de dados*/
    public static Connection Conectar_banco(){
        con = null;
		
        //Try-catch para localizar a classe responsável pelo driver 'jdbc'
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	
        /*Try-catch para tentar se conectar ao banco*/
        try {
            con = DriverManager.getConnection("jdbc:mysql://10.107.144.60:3306/dbcity_share", "root", "bcd127");
        }catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
        return con;
    }
	
    /*Método para encerrar a conexão com banco*/
    public static void Fechar_banco(){
		/*Verifica se a conexão estiver aberta*/
		if(con != null){			
			
			/*Caso a conexão esteja aberta, será encerrada. Caso não apresenta mensagem de erro*/
	        try{
	        	con.close();
	        }catch(SQLException e){
	        	// TODO Auto-generated catch block
	        	e.printStackTrace();
	        }		
		}
    }
}
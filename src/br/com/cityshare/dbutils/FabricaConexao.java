/*Classe respons�vel por realizar, verificar e encerrar a conex�o com o banco de dados*/

package br.com.cityshare.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    static Connection con;

    /*M�todo que realiza a cone�o com o banco de dados*/
    public static Connection Conectar_banco(){
        con = null;
		
        //Try-catch para localizar a classe respons�vel pelo driver 'jdbc'
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
	
    /*M�todo para encerrar a conex�o com banco*/
    public static void Fechar_banco(){
		/*Verifica se a conex�o estiver aberta*/
		if(con != null){			
			
			/*Caso a conex�o esteja aberta, ser� encerrada. Caso n�o apresenta mensagem de erro*/
	        try{
	        	con.close();
	        }catch(SQLException e){
	        	// TODO Auto-generated catch block
	        	e.printStackTrace();
	        }		
		}
    }
}
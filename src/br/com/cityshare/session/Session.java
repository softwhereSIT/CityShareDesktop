/*Classe responsável pela criação da sessão a ser utilizada durante a aplicação*/
package br.com.cityshare.session;

import java.util.Hashtable;
import java.util.Map;

public class Session {
	
	//Hashtable sincronizado
	private Map<String, Object> _map = new Hashtable<String, Object>();
	
	private static Session _session = new Session();
	
	public static Session getSession(){
		return _session;
	}
	
	public void setAttribute(String key, Object value){
		_map.put(key, value);
	}
	
	public Object getAttribute(String key){
		return _map.get(key);
	}
}
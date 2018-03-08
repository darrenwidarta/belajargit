/*
 * HelloWorld! Classe para testar apenas. 
 * 
*/
package 1.controller;

import java.util.List;

import org.hibernate.Session;

import 1.model.Usuario;
import 1.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends BaseAction{
	
	public String execute(){
		System.out.println("Teste");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Teste");
		
		HibernateUtil.persist(usuario);
		
		
		return "success";
	}

}

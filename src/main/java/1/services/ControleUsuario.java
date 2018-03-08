/*
 * Classe responsavel por implementar regras de negocios de manejamento de usuarios 
 * usando os insumos (criados na package util)
*/
package 1.services;

import 1.exceptions.UsuarioNAutorizado;
import 1.model.Usuario;
import 1.util.SQLAutentica;

public class ControleUsuario{
	
	 /* Autenticacao de usuarios
	 */ 
	public static void autenticaUsuario(Usuario usuario) throws UsuarioNAutorizado {
		if (!SQLAutentica.doAutentica(usuario)) throw new UsuarioNAutorizado();
	}
	

}


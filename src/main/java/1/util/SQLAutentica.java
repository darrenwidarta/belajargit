package 1.util;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import 1.model.Usuario;

public class SQLAutentica {

	public static boolean doAutentica(Usuario usuario){

		Session session = HibernateUtil.getSession();
		Usuario consulta = null;
		try{
		consulta = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", usuario.getLogin()))
				.add(Restrictions.eq("senha", usuario.getSenha()))
				.uniqueResult();
		}
		
		finally{
			session.close();
		}
		if (consulta != null) return true;
		else return false;

	}
	
	

}

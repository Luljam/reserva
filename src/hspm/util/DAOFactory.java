package hspm.util;


import hspm.sala.SalaDAO;
import hspm.sala.SalaDAOHibernate;
import hspm.usuario.UsuarioDAO;
import hspm.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

	public static SalaDAO criarSalaDAO() {
		SalaDAOHibernate salaDAO = new SalaDAOHibernate();
		salaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return salaDAO;
	}
	
}

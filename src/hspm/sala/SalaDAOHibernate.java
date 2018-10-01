package hspm.sala;

import java.util.List;
import org.hibernate.Session;



public class SalaDAOHibernate implements SalaDAO {

	private Session session;
	public void setSession(Session session){
		this.session = session;
	}
	
	@Override
	public void salvar(Sala sala) {
		this.session.save(sala);
	}

	@Override
	public void atualizar(Sala sala) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Sala sala) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sala> listar() {
		return this.session.createCriteria(Sala.class).list();
	}

}

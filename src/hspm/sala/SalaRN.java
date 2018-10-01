package hspm.sala;


import java.util.List;

import hspm.util.DAOFactory;

public class SalaRN {
	
	
	private SalaDAO salaDAO;
	
	public SalaRN(){
		this.salaDAO = DAOFactory.criarSalaDAO();
	}
	
	public void salvar(Sala sala){
		Integer codigo = sala.getCodigo();
		if(codigo == null || codigo == 0){
			this.salaDAO.salvar(sala);
		}else{
			this.salaDAO.atualizar(sala);
		}
	}
	
	
	public List<Sala> listar(){
		return this.salaDAO.listar();
	}
}

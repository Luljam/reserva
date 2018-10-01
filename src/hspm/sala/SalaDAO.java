package hspm.sala;

import java.util.List;

import hspm.sala.Sala;

public interface SalaDAO {
	public void salvar(Sala sala);
	public void atualizar(Sala sala);
	public void excluir(Sala sala);
	public List<Sala> listar();

}

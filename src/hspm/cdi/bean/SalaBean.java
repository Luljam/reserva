package hspm.cdi.bean;

import java.util.List;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import hspm.sala.Sala;
import hspm.sala.SalaRN;

@RequestScoped
@ManagedBean(name = "salaBean")
public class SalaBean {

	private Sala sala = new Sala();

	private String destinoSalvar;
	private List<Sala> lista;

	public String salvar() {
		this.destinoSalvar = "/administrativo/cadastrosalas";
		@SuppressWarnings("unused")
		FacesContext context = FacesContext.getCurrentInstance();
		SalaRN salaRN = new SalaRN();
		salaRN.salvar(sala);
		return this.destinoSalvar;
	}

	public List<Sala> getLista() {
		if (this.lista == null) {
			SalaRN salaRN = new SalaRN();
			this.lista = salaRN.listar();
		}
		return this.lista;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}

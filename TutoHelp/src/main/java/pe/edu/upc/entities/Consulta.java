package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "Consulta")
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ConsultaID;

	@ManyToOne
	@JoinColumn(name = "UsuarioID", nullable = false)
	private Usuario usuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "TextoConsulta", nullable = false, length = 20)
	private String TextoConsulta;

	public Consulta(int consultaID, Usuario usuario,String textoConsulta) {
		super();
		ConsultaID = consultaID;
		this.usuario = usuario;
		TextoConsulta = textoConsulta;
	}

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getConsultaID() {
		return ConsultaID;
	}

	public void setConsultaID(int consultaID) {
		ConsultaID = consultaID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTextoConsulta() {
		return TextoConsulta;
	}

	public void setTextoConsulta(String textoConsulta) {
		TextoConsulta = textoConsulta;
	}

	
	
}

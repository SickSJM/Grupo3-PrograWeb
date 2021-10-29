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
@Table(name = "Soporte")
public class Soporte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SoporteID;

	@ManyToOne
	@JoinColumn(name = "UsuarioID", nullable = false)
	private Usuario usuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "ReporteMensaje", nullable = false, length = 20)
	private String ReporteMensaje;

	public Soporte(int soporteID, Usuario usuario,String reporteMensaje) {
		super();
		SoporteID = soporteID;
		this.usuario = usuario;
		ReporteMensaje = reporteMensaje;
	}

	public Soporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSoporteID() {
		return SoporteID;
	}

	public void setSoporteID(int soporteID) {
		SoporteID = soporteID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getReporteMensaje() {
		return ReporteMensaje;
	}

	public void setReporteMensaje(String reporteMensaje) {
		ReporteMensaje = reporteMensaje;
	}
	
	
}

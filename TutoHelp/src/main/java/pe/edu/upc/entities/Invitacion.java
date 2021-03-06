package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "Invitacion")
public class Invitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int InvitacionID;

	@ManyToOne
	@JoinColumn(name = "UsuarioID", nullable = false)
	private Usuario usuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "Emisor", nullable = false, length = 20)
	private String Emisor;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "Comentario", nullable = false)
	private String Comentario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "LinkReunion", nullable = false, length = 20)
	private String LinkReunion;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "Estado", nullable = false)
	private String Estado;

	public Invitacion(int invitacionID, Usuario usuario,String emisor,Date fecha,String comentario,String linkReunion,String estado) {
		super();
		InvitacionID = invitacionID;
		this.usuario = usuario;
		Emisor = emisor;
		this.fecha = fecha;
		Comentario = comentario;
		LinkReunion = linkReunion;
		Estado = estado;
	}

	public Invitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInvitacionID() {
		return InvitacionID;
	}

	public void setInvitacionID(int invitacionID) {
		InvitacionID = invitacionID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEmisor() {
		return Emisor;
	}

	public void setEmisor(String emisor) {
		Emisor = emisor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return Comentario;
	}

	public void setComentario(String comentario) {
		Comentario = comentario;
	}

	public String getLinkReunion() {
		return LinkReunion;
	}

	public void setLinkReunion(String linkReunion) {
		LinkReunion = linkReunion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	

}

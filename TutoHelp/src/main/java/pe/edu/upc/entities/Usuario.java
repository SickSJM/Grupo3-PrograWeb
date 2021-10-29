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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UsuarioID;

	@ManyToOne
	@JoinColumn(name = "idTipoDeUsuario", nullable = false)
	private TipoDeUsuario tipousuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "NombreUsuario", nullable = false, length = 20)
	private String NombreUsuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "ApellidoUsuario", nullable = false, length = 20)
	private String ApellidoUsuario;
	
	//@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	//@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "DNIUsuario", nullable = false)
	private int DNIUsuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "CorreoUsuario", nullable = false, length = 20)
	private String CorreoUsuario;
	
	//@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	//@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "TelefonoUsuario", nullable = false)
	private int TelefonoUsuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "DireccionUsuario", nullable = false, length = 20)
	private String DireccionUsuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "NicknameUsuario", nullable = false, length = 10)
	private String NicknameUsuario;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre del producto no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre del producto no puede contener un número")
	@Column(name = "ContrasenaUsuario", nullable = false, length = 15)
	private String ContrasenaUsuario;

	public Usuario(int usuarioID, TipoDeUsuario tipousuario,String nombreUsuario,String apellidoUsuario,int dNIUsuario,String correoUsuario,
			int telefonoUsuario,String direccionUsuario,String nicknameUsuario,String contrasenaUsuario) {
		super();
		UsuarioID = usuarioID;
		this.tipousuario = tipousuario;
		NombreUsuario = nombreUsuario;
		ApellidoUsuario = apellidoUsuario;
		DNIUsuario = dNIUsuario;
		CorreoUsuario = correoUsuario;
		TelefonoUsuario = telefonoUsuario;
		DireccionUsuario = direccionUsuario;
		NicknameUsuario = nicknameUsuario;
		ContrasenaUsuario = contrasenaUsuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}

	public TipoDeUsuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoDeUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return ApellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		ApellidoUsuario = apellidoUsuario;
	}

	public int getDNIUsuario() {
		return DNIUsuario;
	}

	public void setDNIUsuario(int dNIUsuario) {
		DNIUsuario = dNIUsuario;
	}

	public String getCorreoUsuario() {
		return CorreoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		CorreoUsuario = correoUsuario;
	}

	public int getTelefonoUsuario() {
		return TelefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		TelefonoUsuario = telefonoUsuario;
	}

	public String getDireccionUsuario() {
		return DireccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		DireccionUsuario = direccionUsuario;
	}

	public String getNicknameUsuario() {
		return NicknameUsuario;
	}

	public void setNicknameUsuario(String nicknameUsuario) {
		NicknameUsuario = nicknameUsuario;
	}

	public String getContrasenaUsuario() {
		return ContrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		ContrasenaUsuario = contrasenaUsuario;
	}

	

}

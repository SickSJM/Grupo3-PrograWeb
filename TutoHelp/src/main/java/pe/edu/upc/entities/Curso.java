package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CursoID;
	
	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre de la Categoría no puede contener un caracter especial")
	@Pattern(regexp = "[^0-9]+", message = "El nombre de la Categoría no puede contener un número")
	@Column(name = "CursoNombre", nullable = false, length = 15)
	private String CursoNombre;

	public Curso(int cursoID,String cursoNombre) {
		super();
		CursoID = cursoID;
		CursoNombre = cursoNombre;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCursoID() {
		return CursoID;
	}

	public void setCursoID(int cursoID) {
		CursoID = cursoID;
	}

	public String getCursoNombre() {
		return CursoNombre;
	}

	public void setCursoNombre(String cursoNombre) {
		CursoNombre = cursoNombre;
	}

	
	
}

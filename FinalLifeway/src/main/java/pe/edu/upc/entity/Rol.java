package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")

public class Rol implements Serializable{

	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;

	@Column(name = "NRol", nullable = false, length = 50)
	private String NRol;
	
	public Rol(int idRol, String nRol) {
		super();
		this.idRol = idRol;
		this.NRol = nRol;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNRol() {
		return NRol;
	}

	public void setNRol(String nRol) {
		NRol = nRol;
	}
}

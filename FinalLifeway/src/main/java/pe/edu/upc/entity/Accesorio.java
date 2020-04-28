package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accesorio")

public class Accesorio implements Serializable{

	public Accesorio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAccesorio;

	@Column(name = "NAccesorio", nullable = false, length = 50)
	private String NAccesorio;

	@Column(name = "MPrecio", nullable = false, length = 3)
	private int MPrecio;
	

	public Accesorio(int idAccesorio, String nAccesorio, int mPrecio) {
		super();
		this.idAccesorio = idAccesorio;
		this.NAccesorio = nAccesorio;
		this.MPrecio = mPrecio;
	}

	public int getIdAccesorio() {
		return idAccesorio;
	}

	public void setIdAccesorio(int idAccesorio) {
		this.idAccesorio = idAccesorio;
	}

	public String getNAccesorio() {
		return NAccesorio;
	}

	public void setNAccesorio(String nAccesorio) {
		NAccesorio = nAccesorio;
	}

	public int getMPrecio() {
		return MPrecio;
	}

	public void setMPrecio(int mPrecio) {
		MPrecio = mPrecio;
	}
	

}

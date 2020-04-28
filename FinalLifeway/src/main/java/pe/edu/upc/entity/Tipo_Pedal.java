package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Pedal")

public class Tipo_Pedal implements Serializable{
	
	
	public Tipo_Pedal() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo_Pedal;

	@Column(name = "NTipo_Pedal", nullable = false, length = 50)
	private String NTipo_Pedal;
	
	public Tipo_Pedal(int idTipo_Pedal, String nTipo_Pedal) {
		super();
		this.idTipo_Pedal = idTipo_Pedal;
		this.NTipo_Pedal = nTipo_Pedal;
	}

	public int getIdTipo_Pedal() {
		return idTipo_Pedal;
	}

	public void setIdTipo_Pedal(int idTipo_Pedal) {
		this.idTipo_Pedal = idTipo_Pedal;
	}

	public String getNTipo_Pedal() {
		return NTipo_Pedal;
	}

	public void setNTipo_Pedal(String nTipo_Pedal) {
		NTipo_Pedal = nTipo_Pedal;
	}
}

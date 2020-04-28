package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estatus")

public class Estatus implements Serializable{

	public Estatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstatus;

	@Column(name = "NEstatus", nullable = false, length = 50)
	private String NEstatus;

	public Estatus(int idEstatus, String nEstatus) {
		super();
		this.idEstatus = idEstatus;
		this.NEstatus = nEstatus;
	}

	public int getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getNEstatus() {
		return NEstatus;
	}

	public void setNEstatus(String nEstatus) {
		NEstatus = nEstatus;
	}
}

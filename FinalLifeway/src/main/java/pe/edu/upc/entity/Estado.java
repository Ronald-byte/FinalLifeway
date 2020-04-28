package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estado")

public class Estado implements Serializable{

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstado;

	@Column(name = "NEstado", nullable = false, length = 50)
	private String NEstado;
	
	
	public Estado(int idEstado, String nEstado) {
		super();
		this.idEstado = idEstado;
		this.NEstado = nEstado;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getNEstado() {
		return NEstado;
	}

	public void setNEstado(String nEstado) {
		NEstado = nEstado;
	}
}

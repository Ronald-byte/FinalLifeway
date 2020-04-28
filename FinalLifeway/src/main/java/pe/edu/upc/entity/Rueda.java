package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rueda")

public class Rueda implements Serializable {

	
	public Rueda() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRueda;

	@Column(name = "NRueda", nullable = false, length = 50)
	private String NRueda;
	
	public Rueda(int idRueda, String nRueda) {
		super();
		this.idRueda = idRueda;
		this.NRueda = nRueda;
	}

	public int getIdRueda() {
		return idRueda;
	}

	public void setIdRueda(int idRueda) {
		this.idRueda = idRueda;
	}

	public String getNRueda() {
		return NRueda;
	}

	public void setNRueda(String nRueda) {
		NRueda = nRueda;
	}
}

package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sucursal")

public class Sucursal implements Serializable{

	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;

	@Column(name = "NSucursal", nullable = false, length = 50)
	private String NSucursal;
	
	@Column(name = "TDireccion_Sucursal", nullable = false, length = 50)
	private String TDireccion_Sucursal;
	
	public Sucursal(int idSucursal, String nSucursal, String tDireccion_Sucursal) {
		super();
		this.idSucursal = idSucursal;
		this.NSucursal = nSucursal;
		this.TDireccion_Sucursal = tDireccion_Sucursal;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNSucursal() {
		return NSucursal;
	}

	public void setNSucursal(String nSucursal) {
		NSucursal = nSucursal;
	}

	public String getTDireccion_Sucursal() {
		return TDireccion_Sucursal;
	}

	public void setTDireccion_Sucursal(String tDireccion_Sucursal) {
		TDireccion_Sucursal = tDireccion_Sucursal;
	}
}

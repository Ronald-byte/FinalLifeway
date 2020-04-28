package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")

public class Cliente implements Serializable{
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;

	@Column(name = "NCliente", nullable = false, length = 50)
	private String NCliente;

	@Column(name = "NApellido_P", nullable = false, length = 50)
	private String NApellido_P;
	
	@Column(name = "NApellido_M", nullable = false, length = 50)
	private String NApellido_M;

	@Column(name = "Telefono_Cliente", nullable = false, length = 9)
	private int Telefono_Cliente;
	
	@Column(name = "NCorreo", nullable = false, length = 50)
	private String NCorreo;
	
	@ManyToOne
	@JoinColumn(name = "idDistrito", nullable = false)
	private Distrito distrito;
	
	public Cliente(int idCliente, String nCliente, String nApellido_P, String nApellido_M, int telefono_Cliente,
			String nCorreo, Distrito distrito) {
		super();
		this.idCliente = idCliente;
		this.NCliente = nCliente;
		this.NApellido_P = nApellido_P;
		this.NApellido_M = nApellido_M;
		this.Telefono_Cliente = telefono_Cliente;
		this.NCorreo = nCorreo;
		this.distrito = distrito;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNCliente() {
		return NCliente;
	}

	public void setNCliente(String nCliente) {
		NCliente = nCliente;
	}

	public String getNApellido_P() {
		return NApellido_P;
	}

	public void setNApellido_P(String nApellido_P) {
		NApellido_P = nApellido_P;
	}

	public String getNApellido_M() {
		return NApellido_M;
	}

	public void setNApellido_M(String nApellido_M) {
		NApellido_M = nApellido_M;
	}

	public int getTelefono_Cliente() {
		return Telefono_Cliente;
	}

	public void setTelefono_Cliente(int telefono_Cliente) {
		Telefono_Cliente = telefono_Cliente;
	}

	public String getNCorreo() {
		return NCorreo;
	}

	public void setNCorreo(String nCorreo) {
		NCorreo = nCorreo;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}


}

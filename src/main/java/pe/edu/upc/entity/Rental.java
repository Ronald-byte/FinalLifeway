package pe.edu.upc.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rental")

public class Rental implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRental;
	
	private Date date_rental;
	
	private int Nrohoras;
	
	private int Mtotal;
	
	@ManyToOne
	@JoinColumn(name = "idBike", nullable = false)
	private Bike bike;
	
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "idEmployee", nullable = false)
	private Employee employee;

	public Rental() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rental(int idRental, Date date_rental, int nrohoras, int mtotal, Bike bike, Cliente cliente,
			Employee employee) {
		super();
		this.idRental = idRental;
		this.date_rental = date_rental;
		Nrohoras = nrohoras;
		Mtotal = mtotal;
		this.bike = bike;
		this.cliente = cliente;
		this.employee = employee;
	}

	public int getIdRental() {
		return idRental;
	}

	public void setIdRental(int idRental) {
		this.idRental = idRental;
	}

	public Date getDate_rental() {
		return date_rental;
	}

	public void setDate_rental(Date date_rental) {
		this.date_rental = date_rental;
	}

	public int getNrohoras() {
		return Nrohoras;
	}

	public void setNrohoras(int nrohoras) {
		Nrohoras = nrohoras;
	}

	public int getMtotal() {
		return Mtotal;
	}

	public void setMtotal(int mtotal) {
		Mtotal = mtotal;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}

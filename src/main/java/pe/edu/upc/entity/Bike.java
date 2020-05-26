package pe.edu.upc.entity;
//holaaaaS
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bike")

public class Bike implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBike;
	
	
	
	
	
	
	
	
	

	@Column(name = "MPrecio_bike", nullable = false, length = 50)
	private int MPrecio_bike;

	private Date DateBike;
	
	@ManyToOne
	@JoinColumn(name = "idStatus", nullable = false)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "idBrand", nullable = false)
	private Brand brand;
	
	
	
	public Bike() {
		super();
	}



	public Bike(int idBike, int mPrecio_bike, Date dateBike, Status status, Brand brand) {
		super();
		this.idBike = idBike;
		MPrecio_bike = mPrecio_bike;
		DateBike = dateBike;
		this.status = status;
		this.brand = brand;
	}



	public int getIdBike() {
		return idBike;
	}



	public void setIdBike(int idBike) {
		this.idBike = idBike;
	}



	public int getMPrecio_bike() {
		return MPrecio_bike;
	}



	public void setMPrecio_bike(int mPrecio_bike) {
		MPrecio_bike = mPrecio_bike;
	}



	public Date getDateBike() {
		return DateBike;
	}



	public void setDateBike(Date dateBike) {
		DateBike = dateBike;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public Brand getBrand() {
		return brand;
	}



	public void setBrand(Brand brand) {
		this.brand = brand;
	}



}

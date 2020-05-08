package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Brand")
public class Brand implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBrand;

	@Column(name = "NBrand", nullable = false, length = 50)
	private String NBrand;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int idBrand, String nBrand) {
		super();
		this.idBrand = idBrand;
		this.NBrand = nBrand;
	}

	public int getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public String getNBrand() {
		return NBrand;
	}

	public void setNBrand(String nBrand) {
		NBrand = nBrand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NBrand == null) ? 0 : NBrand.hashCode());
		result = prime * result + idBrand;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		if (NBrand == null) {
			if (other.NBrand != null)
				return false;
		} else if (!NBrand.equals(other.NBrand))
			return false;
		if (idBrand != other.idBrand)
			return false;
		return true;
	}
	
	

}

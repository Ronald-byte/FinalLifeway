
package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	@Column(name = "NRole", nullable = false, length = 15)
	private String NRole;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int idRole, String nRole) {
		super();
		this.idRole = idRole;
		this.NRole = nRole;
	}

	public int getIdRole() {

		return idRole;

	}

	public void setIdRole(int idRole) {

		this.idRole = idRole;

	}

	public String getNRole() {

		return NRole;

	}

	public void setNRole(String nRole) {

		NRole = nRole;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NRole == null) ? 0 : NRole.hashCode());
		result = prime * result + idRole;
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
		Role other = (Role) obj;
		if (NRole == null) {
			if (other.NRole != null)
				return false;
		} else if (!NRole.equals(other.NRole))
			return false;
		if (idRole != other.idRole)
			return false;
		return true;
	}

}

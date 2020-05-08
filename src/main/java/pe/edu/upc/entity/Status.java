package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status")
public class Status implements Serializable {

private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatus;
    @Column(name = "NStatus", nullable = false, length = 15)
    private String NStatus;
    public Status() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Status(int idStatus, String nStatus) {
        super();
        this.idStatus = idStatus;
        this.NStatus = nStatus;

    }

    public int getIdStatus() {
       return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getNStatus() {

        return NStatus;

    }


    public void setNStatus(String nStatus) {
        NStatus = nStatus;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NStatus == null) ? 0 : NStatus.hashCode());
		result = prime * result + idStatus;
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
		Status other = (Status) obj;
		if (NStatus == null) {
			if (other.NStatus != null)
				return false;
		} else if (!NStatus.equals(other.NStatus))
			return false;
		if (idStatus != other.idStatus)
			return false;
		return true;
	}


}












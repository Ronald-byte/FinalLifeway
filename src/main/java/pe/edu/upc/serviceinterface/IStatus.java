
package pe.edu.upc.serviceinterface;


import java.util.List;


import pe.edu.upc.entity.Status;


public interface IStatus {
    public void insert(Status st);
    public List<Status>listar();
}


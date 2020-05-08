
package pe.edu.upc.daointerface;


import java.util.List;


import pe.edu.upc.entity.Status;


public interface StatusDAO {


    public void insert(Status st);

    public List<Status> listar();


}





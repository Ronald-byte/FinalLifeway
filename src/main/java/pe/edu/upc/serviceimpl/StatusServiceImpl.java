
package pe.edu.upc.serviceimpl;


import java.io.Serializable;

import java.util.List;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.daointerface.StatusDAO;

import pe.edu.upc.entity.Status;

import pe.edu.upc.serviceinterface.IStatus;


@Named
@RequestScoped
public class StatusServiceImpl implements Serializable, IStatus{

    private static final long serialVersionUID = 1L;
    @Inject
    private StatusDAO ID;
    @Override
    public void insert(Status st) {
        try {
            ID.insert(st);
        } catch (Exception e) {
            System.out.println("Error en el service al insertar un Status");
        }
       // TODO Auto-generated method stub
       
    }

    @Override
    public List<Status> listar() {
        // TODO Auto-generated method stub
        return ID.listar();
    }

}







					
package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.BrandDAO;
import pe.edu.upc.entity.Brand;
import pe.edu.upc.serviceinterface.IBrand;

@Named
@RequestScoped
public class BrandServiceImpl implements Serializable, IBrand{

	private static final long serialVersionUID = 1L;
    @Inject
    private BrandDAO BD;
	@Override
	public void insert(Brand bra) {
        try {
        	BD.insert(bra);
        } catch (Exception e) {
            System.out.println("Error en el service al insertar un Marca");
        }
	}

	@Override
	public List<Brand> listar() {
		// TODO Auto-generated method stub
		return BD.listar();
	}

}

package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.CitystallDAO;
import pe.edu.upc.entity.Citystall;
import pe.edu.upc.serviceinterface.ICitystall;

@Named
@RequestScoped
public class CitystallServiceImpl implements ICitystall{

	private CitystallDAO ID;
	@Override
	public void insert(Citystall cs) {
		try {
			ID.insert(cs);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una sucursal");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Citystall> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

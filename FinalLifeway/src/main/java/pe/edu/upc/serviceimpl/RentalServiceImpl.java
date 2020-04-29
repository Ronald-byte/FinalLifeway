package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.RentalDAO;
import pe.edu.upc.entity.Rental;
import pe.edu.upc.serviceinterface.IRental;

@Named
@RequestScoped
public class RentalServiceImpl implements IRental{

	private RentalDAO ID;
	@Override
	public void insert(Rental ren) {
		try {
			ID.insert(ren);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una renta");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rental> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

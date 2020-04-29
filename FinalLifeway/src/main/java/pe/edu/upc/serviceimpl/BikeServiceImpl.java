package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.BikeDAO;
import pe.edu.upc.entity.Bike;
import pe.edu.upc.serviceinterface.IBike;

@Named
@RequestScoped
public class BikeServiceImpl implements IBike{

	private BikeDAO ID;
	@Override
	public void insert(Bike bik) {
		try {
			ID.insert(bik);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar una bicicleta");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bike> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

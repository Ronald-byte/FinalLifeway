package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.AccessoryDAO;
import pe.edu.upc.entity.Accessory;
import pe.edu.upc.serviceinterface.IAccessory;

@Named
@RequestScoped
public class AccessoryServiceImpl implements IAccessory{

	private AccessoryDAO ID;
	@Override
	public void insert(Accessory acc) {
		try {
			ID.insert(acc);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un accesorio");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Accessory> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

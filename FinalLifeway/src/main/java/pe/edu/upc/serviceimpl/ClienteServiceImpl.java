package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ClienteDAO;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.serviceinterface.ICliente;

@Named
@RequestScoped
public class ClienteServiceImpl implements ICliente{
	
	
	private ClienteDAO ID;
	@Inject
	@Override
	public void insert(Cliente infectious) {
		try {
			ID.insert(infectious);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un cliente");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}
}

package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface ClienteDAO {
	
	public void insert(Cliente cli);
	public List<Cliente> listar();

}

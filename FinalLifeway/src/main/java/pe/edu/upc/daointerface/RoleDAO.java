package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Role;

public interface RoleDAO {

	public void insert(Role rol);
	public List<Role> listar();
}

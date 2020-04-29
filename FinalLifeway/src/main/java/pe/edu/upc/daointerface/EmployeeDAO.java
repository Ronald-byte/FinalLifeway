package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Employee;

public interface EmployeeDAO {

	public void insert(Employee em);
	public List<Employee> listar();
}

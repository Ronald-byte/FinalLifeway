package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Employee;

public interface IEmployee {

	public void insert(Employee em);
	public List<Employee>listar();
}

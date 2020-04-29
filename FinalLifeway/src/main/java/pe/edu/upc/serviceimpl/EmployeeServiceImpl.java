package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.EmployeeDAO;
import pe.edu.upc.entity.Employee;
import pe.edu.upc.serviceinterface.IEmployee;

@Named
@RequestScoped
public class EmployeeServiceImpl implements IEmployee {

	private EmployeeDAO ID;

	@Override
	public void insert(Employee em) {
		try {
			ID.insert(em);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un trabajador");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

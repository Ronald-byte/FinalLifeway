package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.EmployeeDAO;
import pe.edu.upc.entity.Employee;
import pe.edu.upc.serviceinterface.IEmployee;

@Named
@RequestScoped
public class EmployeeServiceImpl implements IEmployee {

	@Inject
	private EmployeeDAO ED;

	@Override
	public void insert(Employee em) {
		try {
			ED.insert(em);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un trabajador");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> listar() {
		// TODO Auto-generated method stub
		return ED.listar();
	}

	@Override
	public void delete(int idEmployee) {
		ED.delete(idEmployee);
		
	}

	@Override
	public void modificar(Employee e) {
		ED.modificar(e);
		
	}

}

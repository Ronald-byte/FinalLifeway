package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Employee;
import pe.edu.upc.entity.Role;
import pe.edu.upc.serviceinterface.IEmployee;
import pe.edu.upc.serviceinterface.IRole;

@Named
@RequestScoped
public class EmployeeController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IEmployee eService;
	@Inject
	private IRole rService;

	private String mensaje;

	private Employee e;
	private Role r;

	List<Employee> listaEmployee;
	List<Role> listaRole;

	@PostConstruct
	public void init() {
		this.listaEmployee = new ArrayList<Employee>();
		this.e = new Employee();
		this.listaRole = new ArrayList<Role>();
		this.r = new Role();
		this.listEmployee();
		this.listRole();
	}

	// metodos o eventos
	public String newEmployee() {
		this.setE(new Employee());
		return "Employee.xhtml";
	}

	public void insert() {
		try {
			eService.insert(e);
			cleanEmployee();
			this.listEmployee();
		} catch (Exception e1) {
			e1.getMessage();
		}
	}

	public void listEmployee() {
		try {
			listaEmployee = eService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listRole() {
		try {
			listaRole = rService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void cleanEmployee() {
		this.init();
	}

	public void delete(Employee e) {
		try {
			eService.delete(e.getIdEmployee());
			listEmployee();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public String Modifpre(Employee e) {
		this.setE(e);
		return "EmployeeMod.xhtml";
	}

	public void modificar() {
		try {
			eService.modificar(this.e);
			cleanEmployee();
			this.listEmployee();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public IEmployee geteService() {
		return eService;
	}

	public void seteService(IEmployee eService) {
		this.eService = eService;
	}

	public IRole getrService() {
		return rService;
	}

	public void setrService(IRole rService) {
		this.rService = rService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public Role getR() {
		return r;
	}

	public void setR(Role r) {
		this.r = r;
	}

	public List<Employee> getListaEmployee() {
		return listaEmployee;
	}

	public void setListaEmployee(List<Employee> listaEmployee) {
		this.listaEmployee = listaEmployee;
	}

	public List<Role> getListaRole() {
		return listaRole;
	}

	public void setListaRole(List<Role> listaRole) {
		this.listaRole = listaRole;
	}

}

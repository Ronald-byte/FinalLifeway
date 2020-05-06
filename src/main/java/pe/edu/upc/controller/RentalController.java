package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Bike;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.entity.Employee;
import pe.edu.upc.entity.Rental;
import pe.edu.upc.serviceinterface.IBike;
import pe.edu.upc.serviceinterface.ICliente;
import pe.edu.upc.serviceinterface.IEmployee;
import pe.edu.upc.serviceinterface.IRental;

@Named
@RequestScoped
public class RentalController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRental rService;
	@Inject
	private IBike bService;
	@Inject
	private ICliente cService;
	@Inject
	private IEmployee eService;

	private String mensaje;

	private Rental r;
	private Bike b;
	private Cliente c;
	private Employee e;

	List<Rental> listaRental;
	List<Bike> listaBike;
	List<Cliente> listaCliente;
	List<Employee> listaEmployee;

	@PostConstruct
	public void init() {
		this.listaRental = new ArrayList<Rental>();
		this.r = new Rental();
		this.listaBike = new ArrayList<Bike>();
		this.b = new Bike();
		this.listaCliente = new ArrayList<Cliente>();
		this.c = new Cliente();
		this.listaEmployee = new ArrayList<Employee>();
		this.e = new Employee();

		this.list();
		this.listBike();
		this.listCliente();
		this.listEmployee();
	}

	public String newRental() {
		this.setR(new Rental());
		return "Rental.xhtml";
	}

	public void insert() {
		try {
			rService.insert(r);
			cleanRental();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaRental = rService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listBike() {
		try {
			listaBike = bService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listCliente() {
		try {
			listaCliente = cService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listEmployee() {
		try {
			listaEmployee = eService.listar();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public void cleanRental() {
		this.init();
	}

	public void delete(Rental r) {
		try {
			rService.delete(r.getIdRental());
			list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String Modifpre(Rental r) {
		this.setR(r);
		return "RentalMod.xhtml";
	}

	public void modificar() {
		try {
			rService.modificar(this.r);
			cleanRental();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public IRental getrService() {
		return rService;
	}

	public void setrService(IRental rService) {
		this.rService = rService;
	}

	public IBike getbService() {
		return bService;
	}

	public void setbService(IBike bService) {
		this.bService = bService;
	}

	public ICliente getcService() {
		return cService;
	}

	public void setcService(ICliente cService) {
		this.cService = cService;
	}

	public IEmployee geteService() {
		return eService;
	}

	public void seteService(IEmployee eService) {
		this.eService = eService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Rental getR() {
		return r;
	}

	public void setR(Rental r) {
		this.r = r;
	}

	public Bike getB() {
		return b;
	}

	public void setB(Bike b) {
		this.b = b;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public List<Rental> getListaRental() {
		return listaRental;
	}

	public void setListaRental(List<Rental> listaRental) {
		this.listaRental = listaRental;
	}

	public List<Bike> getListaBike() {
		return listaBike;
	}

	public void setListaBike(List<Bike> listaBike) {
		this.listaBike = listaBike;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<Employee> getListaEmployee() {
		return listaEmployee;
	}

	public void setListaEmployee(List<Employee> listaEmployee) {
		this.listaEmployee = listaEmployee;
	}

}

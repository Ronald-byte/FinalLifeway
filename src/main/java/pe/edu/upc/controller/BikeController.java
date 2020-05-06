package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Bike;
import pe.edu.upc.entity.Brand;
import pe.edu.upc.entity.Status;
import pe.edu.upc.serviceinterface.IBike;
import pe.edu.upc.serviceinterface.IBrand;
import pe.edu.upc.serviceinterface.IStatus;

@Named
@RequestScoped
public class BikeController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IBike bService;
	@Inject
	private IStatus sService;
	private IBrand braService;

	private String mensaje;

	private Bike b;
	private Status s;
	private Brand bra;

	List<Bike> listaBike;
	List<Status> listaStatus;
	List<Brand> listaBrand;

	@PostConstruct
	public void init() {
		this.listaBike = new ArrayList<Bike>();
		this.b = new Bike();
		this.listaStatus = new ArrayList<Status>();
		this.s = new Status();
		this.listaBrand = new ArrayList<Brand>();
		this.bra = new Brand();

		this.list();
		this.listStatus();
		this.listBrand();
	}

	public String newBike() {
		this.setB(new Bike());
		return "Bike.xhtml";
	}

	public void insert() {
		try {
			bService.insert(b);
			cleanBike();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaBike = bService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listStatus() {
		try {
			listaStatus = sService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listBrand() {
		try {
			listaBrand = braService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void cleanBike() {
		this.init();
	}

	public void delete(Bike b) {
		try {
			bService.delete(b.getIdBike());
			list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String Modifpre(Bike b) {
		this.setB(b);
		return "listBikeMO.xhtml";
	}

	public void modificar() {
		try {
			bService.modificar(this.b);
			cleanBike();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public IBike getbService() {
		return bService;
	}

	public void setbService(IBike bService) {
		this.bService = bService;
	}

	public IStatus getsService() {
		return sService;
	}

	public void setsService(IStatus sService) {
		this.sService = sService;
	}

	public IBrand getBraService() {
		return braService;
	}

	public void setBraService(IBrand braService) {
		this.braService = braService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Bike getB() {
		return b;
	}

	public void setB(Bike b) {
		this.b = b;
	}

	public Status getS() {
		return s;
	}

	public void setS(Status s) {
		this.s = s;
	}

	public Brand getBra() {
		return bra;
	}

	public void setBra(Brand bra) {
		this.bra = bra;
	}

	public List<Bike> getListaBike() {
		return listaBike;
	}

	public void setListaBike(List<Bike> listaBike) {
		this.listaBike = listaBike;
	}

	public List<Status> getListaStatus() {
		return listaStatus;
	}

	public void setListaStatus(List<Status> listaStatus) {
		this.listaStatus = listaStatus;
	}

	public List<Brand> getListaBrand() {
		return listaBrand;
	}

	public void setListaBrand(List<Brand> listaBrand) {
		this.listaBrand = listaBrand;
	}

}

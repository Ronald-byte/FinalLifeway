package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.entity.Distrito;
import pe.edu.upc.serviceinterface.ICliente;
import pe.edu.upc.serviceinterface.IDistrito;

@Named
@RequestScoped
public class ClienteController {
	
	@Inject
	private ICliente cService;
	
	@Inject
	private IDistrito dService;
	
	private Cliente c;
	private Distrito d;
	
	List<Cliente>listaCliente;
	List<Distrito> listaDistrito;
	
	@PostConstruct
	public void init() {
		this.listaCliente = new ArrayList<Cliente>();
		this.listaDistrito = new ArrayList<Distrito>();
		this.d = new Distrito();
		this.c = new Cliente();
		this.listaCliente();
		this.listaDistrito();
	}
	
	public String newInfectious() {
		this.setC(new Cliente());
		return "infectiousAgent.xhtml";
	}
	
	public void insert() {
		try {
			cService.insert(c);
			cleanCliente();
			this.listaCliente();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listaCliente() {
		try {
			listaCliente = cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listaDistrito() {
		try {
			listaDistrito = dService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void cleanCliente() {
		this.init();
	}
	
	
	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Distrito getD() {
		return d;
	}

	public void setD(Distrito d) {
		this.d = d;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<Distrito> getListaDistrito() {
		return listaDistrito;
	}

	public void setListaDistrito(List<Distrito> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}
}

package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.serviceinterface.ICliente;

@Named
@RequestScoped
public class ClienteController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ICliente cService;

	private String mensaje;

	private Cliente c;

	List<Cliente> listaCliente;

	@PostConstruct
	public void init() {
		this.listaCliente = new ArrayList<Cliente>();
		this.c = new Cliente();
		this.list();
	}

	public String newCliente() {
		this.setC(new Cliente());
		return "Cliente.xhtml";
	}

	public void insert() {
		try {
			cService.insert(c);
			cleanCliente();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaCliente = cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanCliente() {
		this.init();
	}

	public void delete(Cliente c) {
		try {
			cService.delete(c.getIdCliente());
			list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String Modifpre(Cliente c) {
		this.setC(c);
		return "ClienteMod.xhtml";
	}

	public void modificar() {
		try {
			cService.modificar(this.c);
			cleanCliente();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public ICliente getcService() {
		return cService;
	}

	public void setcService(ICliente cService) {
		this.cService = cService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

}

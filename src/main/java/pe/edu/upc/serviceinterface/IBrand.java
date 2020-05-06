package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Brand;

public interface IBrand {
	public void insert(Brand bra);

	public List<Brand> listar();
}

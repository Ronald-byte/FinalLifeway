package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Product;

public interface ProductDAO {

	public void insert(Product pro);
	public List<Product> listar();
}

package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.ProductDAO;
import pe.edu.upc.entity.Product;
import pe.edu.upc.serviceinterface.IProduct;

@Named
@RequestScoped
public class ProductServiceImpl implements IProduct{

	private ProductDAO ID;
	@Override
	public void insert(Product pro) {
		try {
			ID.insert(pro);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un producto");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

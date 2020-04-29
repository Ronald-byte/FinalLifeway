package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Rental;

public interface RentalDAO {

	public void insert(Rental ren);
	public List<Rental> listar();
}

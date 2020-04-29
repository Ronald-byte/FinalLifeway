package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Citystall;

public interface CitystallDAO {

	public void insert(Citystall cs);
	public List<Citystall> listar();
}

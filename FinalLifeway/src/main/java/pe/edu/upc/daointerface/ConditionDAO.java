package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Condition;

public interface ConditionDAO {

	public void insert(Condition con);
	public List<Condition> listar();
}

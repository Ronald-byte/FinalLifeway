package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Condition;

public interface ICondition {

	public void insert(Condition con);
	public List<Condition>listar();
}

package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.ConditionDAO;
import pe.edu.upc.entity.Condition;
import pe.edu.upc.serviceinterface.ICondition;

@Named
@RequestScoped
public class ConditionServiceImpl implements ICondition{

	private ConditionDAO ID;
	@Override
	public void insert(Condition con) {
		try {
			ID.insert(con);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar el estado");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Condition> listar() {
		// TODO Auto-generated method stub
		return ID.listar();
	}

}

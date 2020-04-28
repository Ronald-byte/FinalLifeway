package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Distrito;
import pe.edu.upc.serviceinterface.IDistrito;

@Named
@RequestScoped
public class DistritoServiceImpl implements Serializable, IDistrito{
	
	private static final long serialVersionUID = 1L;
	@Inject
	
	private IDistrito dDAO;

	@Override
	public void insert(Distrito type) {
		dDAO.insert(type);
	}

	@Override
	public List<Distrito> listar() {
		// TODO Auto-generated method stub
		return dDAO.listar();
	}

}

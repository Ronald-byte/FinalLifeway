package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.EmployeeDAO;
import pe.edu.upc.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO, Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName ="FinalLifeway")
	private EntityManager em;
@Transactional
	@Override
	public void insert(Employee emp) {
		try {
			em.persist(emp);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Trabajador");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listar() {
		List<Employee> lista = new ArrayList<Employee>();
		try {
			Query q = em.createQuery("select i from Trabajador i");
			lista = (List<Employee>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de Trabajador");
		}
		return lista;
	}
}

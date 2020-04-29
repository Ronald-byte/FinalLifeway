package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.RoleDAO;
import pe.edu.upc.entity.Role;

public class RoleDAOImpl implements RoleDAO, Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName ="FinalLifeway")
	private EntityManager em;
@Transactional
	@Override
	public void insert(Role ro) {
		try {
			em.persist(ro);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de rol");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> listar() {
		List<Role> lista = new ArrayList<Role>();
		try {
			Query q = em.createQuery("select i from rol i");
			lista = (List<Role>) q.getResultList();
		} catch (

		Exception e) {
			System.out.println("Error al listar los datos de rol");
		}
		return lista;
	}
}

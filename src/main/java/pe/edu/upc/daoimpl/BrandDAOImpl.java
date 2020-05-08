package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.BrandDAO;
import pe.edu.upc.entity.Brand;

public class BrandDAOImpl implements BrandDAO, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "FinalLifeway")
	private EntityManager em;
    @Transactional
	@Override
	public void insert(Brand bra) {
    	try {
            em.persist(bra);
        } catch (Exception e) {
            System.out.println("Error al insertar registro de Marca");
        }
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Brand> listar() {
		List<Brand> lista = new ArrayList<Brand>();
        try {
            Query q = em.createQuery("select b from Brand b");
            lista = (List<Brand>) q.getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar los datos de Marca");
        }
        return lista;
	}

	
	
}

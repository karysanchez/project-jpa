/**
 * 
 */
package com.karosanpu.project_jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.karosanpu.project_jpa.dao.SubGeneroDAO;
import com.karosanpu.project_jpa.entity.SubGenero;

/**
 * @author ksanchezpu Clase que implementa el CRUD para las transacciones para
 *         la tabla de subgenero.
 */
public class SubGeneroDAOImpl implements SubGeneroDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceKarosanpu");

	@Override
	public void guardar(SubGenero subGenero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(SubGenero subGenero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SubGenero> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		TypedQuery<SubGenero> queryTyped = (TypedQuery<SubGenero>) em.createQuery("FROM SubGenero ORDER BY descripcion");
		return queryTyped.getResultList();
	}

	@Override
	public SubGenero consultarById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

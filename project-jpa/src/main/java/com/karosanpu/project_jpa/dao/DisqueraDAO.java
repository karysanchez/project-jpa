/**
 * 
 */
package com.karosanpu.project_jpa.dao;

import java.util.List;

import com.karosanpu.project_jpa.entity.Disquera;

/**
 * @author ksanchezpu
 * Interface que genera el DAO para las transacciones del CRUD a la tabla de disquera.
 */
public interface DisqueraDAO {

	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Disquera disquera);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
}

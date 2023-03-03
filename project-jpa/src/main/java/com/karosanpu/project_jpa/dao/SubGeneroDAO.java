/**
 * 
 */
package com.karosanpu.project_jpa.dao;

import java.util.List;

import com.karosanpu.project_jpa.entity.SubGenero;

/**
 * @author ksanchezpu Interface que genera el DAO para las transacciones del
 *         CRUD con JPA a la tabla de genero.
 */
public interface SubGeneroDAO {

	/**
	 * Metodo que permite guardar un subgenero.
	 * 
	 * @param subGenero {@link SubGenero} objeto a guardar.
	 */
	void guardar(SubGenero subGenero);

	/**
	 * Metodo que permite actualizar un subgenero.
	 * 
	 * @param subGenero {@link SubGenero} objeto a actualizar.
	 */
	void actualizar(SubGenero subGenero);

	/**
	 * Metodo que permite eliminar un subgenero por su identificador.
	 * 
	 * @param id {@link Long} identificador del subgenero a eliminar.
	 */
	void eliminar(Long id);

	/**
	 * Metodo que permite consultar la lista de subgeneros.
	 * 
	 * @return {@link List} lista de subgeneros consultados.
	 */
	List<SubGenero> consultar();

	/**
	 * Metodo que permite consultar un subgnero a partir de su identificador
	 * 
	 * @param id {@link Long} identificador del subgenero a consultar.
	 * @return {@link SubGenero} un objeto subgnero consultado.
	 */
	SubGenero consultarById(Long id);
}

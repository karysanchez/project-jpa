/**
 * 
 */
package com.karosanpu.project_jpa.dao.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.karosanpu.project_jpa.dao.SubGeneroDAO;
import com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl;
import com.karosanpu.project_jpa.entity.Genero;
import com.karosanpu.project_jpa.entity.SubGenero;

/**
 * @author ksanchezpu Clase TEST para comprar el funcionamiento de los metodos
 *         del CRUD de subgenero.
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl#guardar(com.karosanpu.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);

		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl#actualizar(com.karosanpu.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		
		SubGenero subGeneroConsultado = this.subGeneroDAO.consultarById(7L);
		
		subGeneroConsultado.setDescripcion("Trash Metal");
		subGeneroConsultado.getGenero().setDescripcion("Metal Trash");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
		
	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(7L);
	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();

		assertTrue(subGenerosConsultados.size() > 0);

		for (SubGenero subGenero : subGenerosConsultados) {
			System.out.println("Subgenero: " + subGenero.getDescripcion());

			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
		}

	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}

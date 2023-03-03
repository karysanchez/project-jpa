/**
 * 
 */
package com.karosanpu.project_jpa.dao.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.karosanpu.project_jpa.dao.DisqueraDAO;
import com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl;
import com.karosanpu.project_jpa.entity.Disquera;

/**
 * @author ksanchezpu
 *
 */
class DisqueraDAOImplTest {

	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl#guardar(com.karosanpu.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {

		Disquera disquera = new Disquera();
		disquera.setDescripcion("Elektrik");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);

		this.disqueraDAO.guardar(disquera);

	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl#actualizar(com.karosanpu.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9L);

		disqueraConsultada.setDescripcion("Disquera IronMaiden");

		this.disqueraDAO.actualizar(disqueraConsultada);

	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl#eliminar(com.karosanpu.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {

		Long id = 9L;

		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();

		assertTrue(disquerasConsultadas.size() > 0);

		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for
	 * {@link com.karosanpu.project_jpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(25L);

		assertNotNull(disquera);

		System.out.println("La Disquera: " + disquera.getDescripcion());
	}

	@Test
	void testConsultarByDescripcionJPQL() {

		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionJPQL("Elektrik");

		assertNotNull(disqueraConsultada);

		System.out.println("Disquera by descripción: " + disqueraConsultada);

	}
	
	@Test
	void consultarByDescripcionNative() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionNative("Elektrik");
		assertNotNull(disqueraConsultada);

		System.out.println("Disquera by descripción: " + disqueraConsultada);
	}

}

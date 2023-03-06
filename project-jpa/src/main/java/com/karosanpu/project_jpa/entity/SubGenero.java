/**
 * 
 */
package com.karosanpu.project_jpa.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author ksanchezpu Clase que representa el entity que mappea a la tabla de
 *         subgenero con JPA
 */
@Entity
@Table(name = "subgenero")
public class SubGenero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSubGenero")
	private Long idSubGenero;

	@Column(name = "descripcion")
	private String descripcion;

	/**
	 * ManyToOne si no se pone nada coloca automaticamente EAGER es igual que
	 * poner:ManyToOne(fetch = FetchType.EAGER)
	 * Para guardar a las dos tablas en cascada registro nuevo: Cascade(CascadeType.PERSIST)
	 * Para actualizar las dos tablas en cascada: Cascade(CascadeType.MERGE)
	 * Para eliminar las dos tablas en cascada: Cascade(CascadeType.REMOVE)
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGenero")
	@Cascade(CascadeType.REMOVE)
	private Genero genero;

	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;

	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;

	@Column(name = "estatus")
	private boolean estatus;

	/**
	 * @return the idSubGenero
	 */
	public Long getIdSubGenero() {
		return idSubGenero;
	}

	/**
	 * @param idSubGenero the idSubGenero to set
	 */
	public void setIdSubGenero(Long idSubGenero) {
		this.idSubGenero = idSubGenero;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}

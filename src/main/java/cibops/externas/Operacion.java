package cibops.externas;

import java.time.Instant;


import javax.persistence.MappedSuperclass;

public class Operacion {
	
	private String nombre;
	private String descripcion;
	private Instant fechaApertura;
	private Instant fechaCierre;

	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Instant getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Instant fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Instant getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Instant fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

		
}

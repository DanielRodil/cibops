package cibops.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import es.mde.cibops.ActividadOperativa;

@Entity
@Table(name="ACTIVIDAD_OPERATIVA")
public class ActividadOperativaConId extends ActividadOperativa {

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ActividadOperativaConId() {}
		
}

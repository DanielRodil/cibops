package cibops.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import es.mde.cibops.GestionJudicial;

@Entity
@Table(name="GESTION_JUDICIAL")
public class GestionJudicialConId extends GestionJudicial {

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GestionJudicialConId() {}
		
}

package cibops.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibops.entidades.ActividadOperativaConId;

@Repository
public interface ActividadOperativaConIdDAO extends JpaRepository<ActividadOperativaConId, Long> {

}

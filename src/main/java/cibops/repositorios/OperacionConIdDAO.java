package cibops.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibops.entidades.OperacionConId;

@Repository
public interface OperacionConIdDAO extends JpaRepository<OperacionConId, Long> {

}

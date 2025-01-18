package dev.rafaelbarragan.gestionescolar.domain.repository;

import dev.rafaelbarragan.gestionescolar.domain.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}

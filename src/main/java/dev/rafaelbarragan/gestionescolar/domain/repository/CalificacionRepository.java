package dev.rafaelbarragan.gestionescolar.domain.repository;

import dev.rafaelbarragan.gestionescolar.domain.entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
}

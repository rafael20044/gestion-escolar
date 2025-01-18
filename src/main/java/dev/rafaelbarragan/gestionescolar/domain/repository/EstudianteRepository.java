package dev.rafaelbarragan.gestionescolar.domain.repository;

import dev.rafaelbarragan.gestionescolar.domain.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}

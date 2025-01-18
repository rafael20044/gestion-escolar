package dev.rafaelbarragan.gestionescolar.domain.repository;

import dev.rafaelbarragan.gestionescolar.domain.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Long> {
}

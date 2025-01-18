package dev.rafaelbarragan.gestionescolar.domain.repository;

import dev.rafaelbarragan.gestionescolar.domain.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Long> {
}

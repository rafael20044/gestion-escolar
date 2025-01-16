package dev.rafaelbarragan.gestionescolar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calificacion {

    private Long id;
    private Estudiante estudiante;
    private Clase clase;
    private Double nota;
    private LocalDate fecha;
}

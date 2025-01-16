package dev.rafaelbarragan.gestionescolar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reporte {

    private Long id;
    private Estudiante estudiante;
    private List<Calificacion> calificaciones;
    private String observaciones;
    private LocalDate fechaGeneracion;
}

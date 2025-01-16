package dev.rafaelbarragan.gestionescolar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Horario {

    private Long id;
    private Integer diaSemana;
    private LocalDate horaInicio;
    private LocalDate horaFinal;
}

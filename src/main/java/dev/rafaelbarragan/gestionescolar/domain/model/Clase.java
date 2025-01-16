package dev.rafaelbarragan.gestionescolar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clase {

    private Long id;
    private String nombre;
    private Profesor profesor;
    private Horario horario;
}

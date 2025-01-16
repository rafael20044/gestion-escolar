package dev.rafaelbarragan.gestionescolar.domain.model;

import dev.rafaelbarragan.gestionescolar.domain.object.Contacto;
import dev.rafaelbarragan.gestionescolar.domain.object.Materia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profesor {

    private Long id;
    private String nombre;
    private String identificacion;
    private Contacto contacto;
    private List<Materia> materias;
}

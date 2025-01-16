package dev.rafaelbarragan.gestionescolar.domain.model;

import dev.rafaelbarragan.gestionescolar.domain.object.Contacto;
import dev.rafaelbarragan.gestionescolar.domain.object.Direccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estudiante {

    private Long id;
    private String nombre;
    private String identificacion;
    private LocalDate fechaNacimiento;
    private Direccion direccion;
    private Contacto contacto;

}

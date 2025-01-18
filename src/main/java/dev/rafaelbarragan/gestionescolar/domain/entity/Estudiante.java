package dev.rafaelbarragan.gestionescolar.domain.entity;

import dev.rafaelbarragan.gestionescolar.domain.object.Contacto;
import dev.rafaelbarragan.gestionescolar.domain.object.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name = "estudiantes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String identificacion;

    private LocalDate fechaNacimiento;

    @Embedded
    private Direccion direccion;

    @Embedded
    private Contacto contacto;

    @OneToMany(mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<Reporte> reportes;
}

package dev.rafaelbarragan.gestionescolar.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name = "reportes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Estudiante estudiante;

    @ManyToMany(mappedBy = "reportes")
    private List<Calificacion> calificaciones;

    private String observaciones;

    private LocalDate fechaGeneracion;
}

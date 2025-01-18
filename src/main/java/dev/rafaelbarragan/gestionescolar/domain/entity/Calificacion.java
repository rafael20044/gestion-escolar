package dev.rafaelbarragan.gestionescolar.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name = "calificaciones")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Estudiante estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    private Clase clase;

    private Double nota;

    private LocalDate fecha;

    @ManyToMany(mappedBy = "calificaciones")
    private List<Reporte> reportes;
}

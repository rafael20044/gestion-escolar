package dev.rafaelbarragan.gestionescolar.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "clases")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    private Profesor profesor;

    @OneToOne
    private Horario horario;

    @OneToMany(mappedBy = "clase")
    private List<Calificacion> calificaciones;
}

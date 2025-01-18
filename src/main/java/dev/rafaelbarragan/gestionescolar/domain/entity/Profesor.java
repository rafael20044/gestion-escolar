package dev.rafaelbarragan.gestionescolar.domain.entity;

import dev.rafaelbarragan.gestionescolar.domain.object.Contacto;
import dev.rafaelbarragan.gestionescolar.domain.object.Materia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "profesores")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String identificacion;

    @Embedded
    private Contacto contacto;

    @ElementCollection(targetClass = Materia.class)
    @Enumerated(EnumType.STRING)
    private List<Materia> materias;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    private List<Clase> clases;
}

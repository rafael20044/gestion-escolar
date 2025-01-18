package dev.rafaelbarragan.gestionescolar.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "horarios")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer diaSemana;

    private LocalDate horaInicio;

    private LocalDate horaFinal;
}

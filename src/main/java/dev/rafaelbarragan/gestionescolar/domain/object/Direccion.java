package dev.rafaelbarragan.gestionescolar.domain.object;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Direccion {
    private String ciudad;
    private String calle;
    private String pais;
}

package dev.rafaelbarragan.gestionescolar.domain.object;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Contacto {
    private String correo;
    private String telefono;
}

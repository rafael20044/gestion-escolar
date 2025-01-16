package dev.rafaelbarragan.gestionescolar.domain.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contacto {

    private String correo;
    private String telefono;

}

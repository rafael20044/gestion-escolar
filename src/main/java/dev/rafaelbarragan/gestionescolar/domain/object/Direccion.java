package dev.rafaelbarragan.gestionescolar.domain.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Direccion {

    private String ciudad;
    private String barrio;

}

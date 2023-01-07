package com.banquito.core.clientesmongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteReferencia {
    
    private String tipoReferencia;
    private String nombreCompleto;
    private String direccion;
    private String telefonoCasa;
    private String telefonoMovil;
    private String correoElectronico;

}

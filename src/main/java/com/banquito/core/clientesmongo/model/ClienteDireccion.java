package com.banquito.core.clientesmongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDireccion {
    
    private String tipoDireccion;
    private String linea1;
    private String linea2;
    private String ciudad;
    private Float latitud;
    private Float longitud;
}

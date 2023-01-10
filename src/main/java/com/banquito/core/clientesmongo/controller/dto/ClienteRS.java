package com.banquito.core.clientesmongo.controller.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteRS implements Serializable {

    private String id;
    private String tipoIdentificacion;
    private String identificacion;
    private String nombreCompleto;
    private String estado;
    private Date fechaCreacion;
    
}

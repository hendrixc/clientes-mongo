package com.banquito.core.clientesmongo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "clientes")
@CompoundIndexes(
    {@CompoundIndex(name = "idxu_clientes_tipoIdentificacionEIdentificacion", 
        def="{'tipoIdentificacion': 1, 'identificacion':1}", unique = true)}
)
public class Cliente {
    
    @Id
    private String id;
    private String tipoIdentificacion;
    private String identificacion;
    @Indexed
    private String apellidos;
    private String nombres;
    private String nombreCompleto;
    private Date fechaNacimiento;
    private BigDecimal ingresos;
    private BigDecimal egresos;
    private String estado;
    private Date fechaCreacion;

    private List<ClienteDireccion> direcciones;
    private List<ClienteReferencia> referencias;
    private List<ClienteInformacionContacto> contactos;

    @Version
    private Long version;
}

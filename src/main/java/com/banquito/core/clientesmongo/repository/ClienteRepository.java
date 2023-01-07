package com.banquito.core.clientesmongo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.banquito.core.clientesmongo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
    
    Cliente findByTipoIdentificacionAndIdentificacion(String tipoIdentificacion, String identificacion);
    List<Cliente> findByApellidosOrderByNombres(String apellidos);
    List<Cliente> findByApellidosLikeOrderByNombres(String apellidos);
    List<Cliente> findByIngresosGreaterThan(BigDecimal ingresos);
}

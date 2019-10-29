package com.tecsup.demo.repositorio;

import com.tecsup.demo.modelo.usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface usuarioRepository extends CrudRepository<usuario,Integer>{

}
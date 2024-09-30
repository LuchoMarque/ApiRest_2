package org.example.persona.servicies;

import org.example.persona.entities.Base;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;//Trae lista de entidades
    public Page<E> findAll(Pageable pageable) throws Exception;


    public E findById(ID id) throws Exception;//Traer persona segun ID
    public E save(E entity) throws Exception;//Guarda entidad nueva
    public E update(ID id, E entity) throws Exception;//Actualiza etidad
    public boolean delete(ID id) throws Exception;//Borra entidad

}

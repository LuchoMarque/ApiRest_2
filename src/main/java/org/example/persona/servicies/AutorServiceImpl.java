package org.example.persona.servicies;

import org.example.persona.entities.Autor;
import org.example.persona.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository repository;

    public AutorServiceImpl(AutorRepository repository) {
        super(repository);}

}

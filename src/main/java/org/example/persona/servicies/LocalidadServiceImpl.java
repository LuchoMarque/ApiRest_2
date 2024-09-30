package org.example.persona.servicies;

import org.example.persona.entities.Localidad;
import org.example.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}

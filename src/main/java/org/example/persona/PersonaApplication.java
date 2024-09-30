package org.example.persona;


import org.example.persona.entities.Persona;
import org.example.persona.repositories.PersonaRepository;
import org.example.persona.entities.Domicilio;
import org.example.persona.entities.Localidad;
import org.example.persona.repositories.LocalidadRepository;
import org.example.persona.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication implements CommandLineRunner {

    @Autowired
    private PersonaRepository personaRepository;



    @Autowired
    private LocalidadRepository localidadRepository;


    @Autowired
    private AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(PersonaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear persona llamada Batman
        Persona personaBatman = new Persona();
        personaBatman.setNombre("Bruce");
        personaBatman.setApellido("Wayne");
        personaBatman.setDni(12345678);

        // Crear domicilio para Batman
        Domicilio domicilioBatman = new Domicilio();
        domicilioBatman.setCalle("Calle de la Oscuridad");
        domicilioBatman.setNumero(100);

        // Crear localidad para el domicilio
        Localidad gotham = new Localidad();
        gotham.setDenominacion("Gotham City");

        // Guardar la localidad en el repositorio
        localidadRepository.save(gotham);

        // Asignar la localidad al domicilio
        domicilioBatman.setLocalidad(gotham);

        // Asignar el domicilio a Batman
        personaBatman.setDomicilio(domicilioBatman);

        // Guardar la persona Batman en el repositorio
        personaRepository.save(personaBatman);


    }
}

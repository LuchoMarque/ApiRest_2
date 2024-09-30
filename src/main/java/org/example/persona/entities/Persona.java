package org.example.persona.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class Persona extends Base {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name= "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;



   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name ="fk_domicilio")
   private Domicilio domicilio;


   @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
   @JoinTable(name="personalibro",
        joinColumns = @JoinColumn(name="persona_id"),
        inverseJoinColumns = @JoinColumn(name="libro_id"))
        private List<Libro> libros = new ArrayList<Libro>();


}

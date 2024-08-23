package hn.unah.lenguajes.practica2.models;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "artista")
@Data
public class Artista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoartista")
    private long codigoArtista;

    @Column(name = "nombreartistico")
    private String nombreArtistico;

    private String nombre;

    private String apellido;
    
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;

    //@OneToOne(mappedBy = "informacionContacto")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigocontacto", referencedColumnName = "codigocontacto")
    private InformacionContacto informacionContacto;//Duenia de la relacion porque tiene la FK

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private List<Canciones> Canciones;

}


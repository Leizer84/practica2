package hn.unah.lenguajes.practica2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "canciones")
@Data
public class Canciones {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name = "codigocancion")
    private long codigoCancion;

    private String titulo;

    private String album;

    @Column(name = "anyolanzamiento")
    private long anyoLanzamiento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoartista", referencedColumnName = "codigoartista")
    private Artista artista;

}

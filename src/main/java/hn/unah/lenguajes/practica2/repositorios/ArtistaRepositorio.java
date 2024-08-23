package hn.unah.lenguajes.practica2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.practica2.models.Artista;

@Repository
public interface ArtistaRepositorio extends JpaRepository<Artista, Long> {
    
}

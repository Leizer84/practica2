package hn.unah.lenguajes.practica2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.practica2.models.Canciones;

public interface CancionesRepositorio extends JpaRepository<Canciones, Long> {
    
}

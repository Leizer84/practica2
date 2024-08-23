package hn.unah.lenguajes.practica2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.practica2.models.InformacionContacto;

@Repository
public interface InformacionContactoRepositorio extends JpaRepository<InformacionContacto, Long> {
    
}

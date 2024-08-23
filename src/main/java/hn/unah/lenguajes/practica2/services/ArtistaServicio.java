package hn.unah.lenguajes.practica2.services;

import java.lang.ProcessHandle.Info;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.practica2.models.Artista;
import hn.unah.lenguajes.practica2.models.InformacionContacto;
import hn.unah.lenguajes.practica2.repositorios.ArtistaRepositorio;
import hn.unah.lenguajes.practica2.repositorios.InformacionContactoRepositorio;

@Service
public class ArtistaServicio {
    
    @Autowired
    private ArtistaRepositorio artistaRepositorio;

    @Autowired
    private InformacionContactoRepositorio informacionContactoRepositorio;

    public List<Artista> obtenerTodos(){
        return this.artistaRepositorio.findAll();
    }

    public Artista crearArtista(Artista nvoArtista){
        Artista artistaGuardar = this.artistaRepositorio.save(nvoArtista);
        nvoArtista.getInformacionContacto().setArtista(nvoArtista);
        this.artistaRepositorio.save(artistaGuardar);

        InformacionContacto nvoContacto = nvoArtista.getInformacionContacto();
        nvoContacto.setArtista(artistaGuardar);
        this.informacionContactoRepositorio.save(nvoContacto);
        
        return artistaGuardar;
    }

    public boolean buscarPorCodigo(long codigoArtista){
        return this.artistaRepositorio.existsById(codigoArtista);
    }
}

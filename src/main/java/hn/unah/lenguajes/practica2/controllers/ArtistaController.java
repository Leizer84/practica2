package hn.unah.lenguajes.practica2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.practica2.models.Artista;
import hn.unah.lenguajes.practica2.services.ArtistaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/artista")
public class ArtistaController {
    
    @Autowired
    private ArtistaServicio artistaServicio;

    @GetMapping("/obtener/todos")
    public List<Artista> obtenerTodos() {
        return this.artistaServicio.obtenerTodos();
    }

    @PostMapping("/crear/nuevo")
    public Artista crearArtista(@RequestBody Artista nvoArtista) {
        if(!this.artistaServicio.buscarPorCodigo(nvoArtista.getCodigoArtista())){
            return this.artistaServicio.crearArtista(nvoArtista);
        }
        return null;
    }
    
    

}

package usuario.frecuencia.frecuenciaMaxima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usuario.frecuencia.frecuenciaMaxima.servicio.FrecuenciaService;

@RestController
@RequestMapping("/frecuencia")
public class FrecuenciaController {

    @Autowired
    private FrecuenciaService frecuenciaService;

    @GetMapping("/{id}/{frecuencia}")
    public String getFrecuencia(@PathVariable Integer id, @PathVariable Double frecuencia){
        return frecuenciaService.frecuencia(id,frecuencia);
    }
}

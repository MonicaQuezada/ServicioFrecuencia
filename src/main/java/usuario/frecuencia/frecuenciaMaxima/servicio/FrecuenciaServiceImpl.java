package usuario.frecuencia.frecuenciaMaxima.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import usuario.frecuencia.frecuenciaMaxima.entidad.Frecuencia;
import usuario.frecuencia.frecuenciaMaxima.entidad.Usuario;

import java.util.HashMap;
import java.util.Map;

@Service
public class FrecuenciaServiceImpl implements FrecuenciaService{
    @Autowired
    private RestTemplate template = new RestTemplate();

    @Override
    public String frecuencia(Integer id, Double frecuencia){
        Map<String,Integer> pathVariables = new HashMap<String,Integer>();
        pathVariables.put("id",id);
        Usuario usuario = template.getForObject("http://44.205.153.171:8080/user/{id}",Usuario.class,pathVariables);
        return new Frecuencia(usuario,frecuencia).frecuenciaMax();
    }
}

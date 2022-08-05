package usuario.frecuencia.frecuenciaMaxima.servicio;

import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaService {

    String frecuencia(Integer id, Double frecuencia);

}

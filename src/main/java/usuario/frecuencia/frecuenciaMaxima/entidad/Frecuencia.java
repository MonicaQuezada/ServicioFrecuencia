package usuario.frecuencia.frecuenciaMaxima.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Frecuencia {
    private Usuario usuario;
    private Double frecuencia;

    public String frecuenciaMax(){
        String estado = "normal";
        int edad = usuario.getAge();
        int frecmax = 220-edad;
        int umbral = Integer.parseInt(String.valueOf((frecmax*85)/100));
        if (frecuencia>umbral){
            estado = "riesgo";
        }
        return estado;
    }
}

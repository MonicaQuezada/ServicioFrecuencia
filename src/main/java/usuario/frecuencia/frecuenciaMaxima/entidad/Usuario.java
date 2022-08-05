package usuario.frecuencia.frecuenciaMaxima.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private Integer id;
    private String numberID;
    private String firstName;
    private String lastName;
    private String sex;
    private Integer age;
    private String state;

}

package app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDto {
    int nro_libreta;
    String nombre;
    String apellido;
    int edad;
    String genero;
    int dni;
    String ciudad_residencia;
}

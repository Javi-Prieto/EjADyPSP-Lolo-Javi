package salesianostriana.dam.DTO;

import lombok.Builder;
import salesianostriana.dam.EjLoloJaviModel.Alumno;
import salesianostriana.dam.EjLoloJaviModel.Curso;
import salesianostriana.dam.EjLoloJaviModel.Direccion;
@Builder
public record GetAlumnoDTO(String nombre, String apellidos,
                        String email, String curso, String direccion) {
        public static GetAlumnoDTO of(Alumno al){
            return GetAlumnoDTO.builder()
                    .nombre(al.getNombre())
                    .apellidos(al.getApellido1()+al.getApellido2())
                    .email(al.getEmail())
                    .curso(al.getCurso() != null
                            ? al.getCurso().getNombre()
                            : "Sin curso")
                    .direccion(al.getDireccion() != null
                                ? al.getDireccion().getLinea1()
                                : "Sin direccion")
                    .build();
        }

}

package salesianostriana.dam.EjLoloJaviModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curso {

    @Id
    @GeneratedValue
    private Long Id;

    private String nombre, tipo, tutor, aula;

    @OneToMany
    private List<Alumno> listaAlumnosC= new ArrayList<>();
}

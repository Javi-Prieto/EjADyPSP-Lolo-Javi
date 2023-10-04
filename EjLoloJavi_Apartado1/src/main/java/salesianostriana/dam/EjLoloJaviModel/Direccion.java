package salesianostriana.dam.EjLoloJaviModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Direccion {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoVia, linea1, linea2, poblacion, provincia;

    private int cp;

    @OneToMany
    private List<Alumno> listaAlumnosD= new ArrayList<>();
}

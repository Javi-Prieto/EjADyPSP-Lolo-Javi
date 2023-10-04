package salesianostriana.dam.EjLoloJaviModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellido1, apellido2, email;

    private int telefono;

    @ManyToOne
    private Direccion direccion;

    @ManyToOne
    private Curso curso;


}

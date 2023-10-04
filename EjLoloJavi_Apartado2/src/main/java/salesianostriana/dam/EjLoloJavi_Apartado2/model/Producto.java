package salesianostriana.dam.EjLoloJavi_Apartado2.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre, desc, pvp;

    private List<String> imagenes;

    @ManyToOne
    private Category categoria;
}

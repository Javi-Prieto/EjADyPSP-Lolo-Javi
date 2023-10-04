package salesianostriana.dam.EjLoloJavi_Apartado2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianostriana.dam.EjLoloJavi_Apartado2.model.Categoria;

public interface RepositorioCategoria
        extends JpaRepository<Categoria, Long> {
}

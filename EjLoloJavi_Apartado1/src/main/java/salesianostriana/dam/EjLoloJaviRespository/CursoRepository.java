package salesianostriana.dam.EjLoloJaviRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianostriana.dam.EjLoloJaviModel.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

package salesianostriana.dam.EjLoloJaviRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianostriana.dam.EjLoloJaviModel.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}

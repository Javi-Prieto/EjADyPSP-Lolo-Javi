package salesianostriana.dam.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import salesianostriana.dam.DTO.GetAlumnoDTO;
import salesianostriana.dam.EjLoloJaviModel.Alumno;
import salesianostriana.dam.EjLoloJaviRespository.AlumnoRepository;

import java.util.List;

@RestController
@RequestMapping("/alumno")
@RequiredArgsConstructor
public class AlumnoController {

    private final AlumnoRepository repo;

    @GetMapping("/")
    public ResponseEntity<List<GetAlumnoDTO>> findAll(){
        List<Alumno> data = repo.findAll();
        if(data.isEmpty())
            return ResponseEntity.notFound().build();

        List<GetAlumnoDTO> result = data.stream()
                                        .map(GetAlumnoDTO::of)
                                        .toList();
        return ResponseEntity.ok(result);
    }
}

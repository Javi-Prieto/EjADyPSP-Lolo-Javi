package salesianostriana.dam.EjLoloJavi_Apartado2.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import salesianostriana.dam.EjLoloJavi_Apartado2.DTO.GetProductoDTO;
import salesianostriana.dam.EjLoloJavi_Apartado2.model.Producto;
import salesianostriana.dam.EjLoloJavi_Apartado2.repository.RepositorioProducto;

import java.util.List;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final RepositorioProducto productorepo;

    @GetMapping("/")
    public ResponseEntity<List<GetProductoDTO>> listarTodo(){
        List<Producto> datos= productorepo.findAll();

        if (datos.isEmpty())
            return ResponseEntity.notFound().build();

        List<GetProductoDTO> resultado=
                datos.stream()
                        .map(GetProductoDTO::of)
                        .toList();
        return ResponseEntity.ok(resultado);
    }
}

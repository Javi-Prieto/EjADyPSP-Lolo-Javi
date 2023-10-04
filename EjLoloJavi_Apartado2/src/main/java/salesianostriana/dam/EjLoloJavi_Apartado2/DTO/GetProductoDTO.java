package salesianostriana.dam.EjLoloJavi_Apartado2.DTO;

import lombok.Builder;
import salesianostriana.dam.EjLoloJavi_Apartado2.model.Producto;

import java.util.Collections;

@Builder
public record GetProductoDTO(String nombre, int pvp, String imagen, String categoria) {

public static GetProductoDTO of(Producto producto){
    return GetProductoDTO.builder()
            .nombre(producto.getNombre())
            .pvp(producto.getPvp())
            .imagen(producto.getImagenes().toString())
            .categoria(producto.getCategoria()!=null?
                    producto.getCategoria().getNombre()
                    : "Sin categoria").build();
}
}


package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Producto listarId(int id);
    Producto add(Producto p);
    Producto edit(Producto p);
    void delete(int id);
}

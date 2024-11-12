
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProductoRepository extends Repository<Producto, Integer> {
    List<Producto> findAll();
    Producto findById(int id);
    Producto save(Producto p);
    void deleteById(int id);
}

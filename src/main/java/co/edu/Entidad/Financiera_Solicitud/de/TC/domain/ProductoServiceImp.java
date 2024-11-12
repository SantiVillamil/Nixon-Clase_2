
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto edit(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public void delete(int id) {
        repositorio.deleteById(id);
    }
}


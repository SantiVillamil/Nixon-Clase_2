
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudServiceImp implements SolicitudService {

    @Autowired
    private SolicitudRepository repositorio;

    @Override
    public List<Solicitud> listar() {
        return repositorio.findAll();
    }

    @Override
    public Solicitud listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Solicitud add(Solicitud s) {
        return repositorio.save(s);
    }

    @Override
    public Solicitud edit(Solicitud s) {
        return repositorio.save(s);
    }

    @Override
    public void delete(int id) {
        repositorio.deleteById(id);
    }
}

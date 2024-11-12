
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;

public interface SolicitudService {
    List<Solicitud> listar();
    Solicitud listarId(int id);
    Solicitud add(Solicitud s);
    Solicitud edit(Solicitud s);
    void delete(int id);
}



package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;

import java.util.List;

public interface PersonaService {
    List<Persona> listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    void delete(int id);
}


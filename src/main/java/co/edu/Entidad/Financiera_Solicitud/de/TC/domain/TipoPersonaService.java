package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;
import java.util.List;
/**
*
* @author Santiago Camacho
*/
public interface TipoPersonaService {
 List<TipoPersona> listar();
 TipoPersona listarId(int id);
 TipoPersona add(TipoPersona tp);
 TipoPersona edit(TipoPersona tp);
 void delete(int id);
}
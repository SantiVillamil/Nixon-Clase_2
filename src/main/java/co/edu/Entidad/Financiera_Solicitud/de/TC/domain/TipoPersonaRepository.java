package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
*
* @author Santiago Camacho
*/
public interface TipoPersonaRepository extends Repository<TipoPersona, Integer>{
 List<TipoPersona> findAll();
 TipoPersona findById(int id);
 TipoPersona save(TipoPersona tp);
 void deleteById(int id);
}

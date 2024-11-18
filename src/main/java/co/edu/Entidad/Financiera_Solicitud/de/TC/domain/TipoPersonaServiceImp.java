package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
*
* @author Santiago Camacho
*/
@Service
public class TipoPersonaServiceImp implements TipoPersonaService{

 @Autowired
 private TipoPersonaRepository tp_repositorio;

 @Override
 public List<TipoPersona> listar() {
 return tp_repositorio.findAll();
 }
 @Override
 public TipoPersona listarId(int id) {
 return tp_repositorio.findById(id);
 }
 @Override
 public TipoPersona add(TipoPersona tp) {
 return tp_repositorio.save(tp);
 }
 @Override
 public TipoPersona edit(TipoPersona tp) {
 return tp_repositorio.save(tp);
 }
 @Override
 public void delete(int id) {
 tp_repositorio.deleteById(id);
 }

}

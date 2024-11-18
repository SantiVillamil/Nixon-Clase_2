package co.edu.Entidad.Financiera_Solicitud.de.TC.infraestructura;

import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.TipoPersona;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})

public class TipoPersonaRest {
    
    @Autowired
    private TipoPersonaService tpservice;
    
    @GetMapping("/tp_persona")
    public List<TipoPersona> listarTp(){
    return tpservice.listar();
    }
 
    @PostMapping("/agregar_tp_persona")
    public TipoPersona agregar(@RequestBody TipoPersona tp){
    return tpservice.add(tp);
    }

    @GetMapping("/tp_persona/{id}")
    public TipoPersona listarIdTP(@PathVariable("id") int id){
    return tpservice.listarId(id);
    }

    @PutMapping("/tp_persona/{id}")
    public TipoPersona editar(@RequestBody TipoPersona tp, @PathVariable("id") int id){
    tp.setId_tp(id);
    return tpservice.edit(tp);
    }
 
    @DeleteMapping("/tp_persona/{id}")
    public void Deletetp(@PathVariable("id") int id){
    tpservice.delete(id);
    }
    
}

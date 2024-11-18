package co.edu.Entidad.Financiera_Solicitud.de.TC.infraestructura;

import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Solicitud;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.SolicitudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class SolicitudRest {
    
    @Autowired
    private SolicitudService solicitudService;
    
    @GetMapping("/solicitudes")
    public List<Solicitud> listarSolicitudes() {
        return solicitudService.listar();
    }

    @PostMapping("/agregar_solicitudes")
    public Solicitud agregarSolicitud(@RequestBody Solicitud s) {
        return solicitudService.add(s);
    }

    @GetMapping("/solicitudes/{id}")
    public Solicitud listarSolicitudId(@PathVariable("id") int id) {
        return solicitudService.listarId(id);
    }

    @PutMapping("/editar_solicitudes/{id}")
    public Solicitud editarSolicitud(@RequestBody Solicitud s, @PathVariable("id") int id) {
        s.setSolicitudId(id);
        return solicitudService.edit(s);
    }

    @DeleteMapping("/solicitudes/{id}")
    public void eliminarSolicitud(@PathVariable("id") int id) {
        solicitudService.delete(id);
    }
    
}


package co.edu.Entidad.Financiera_Solicitud.de.TC.infraestructura;

import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Persona;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Producto;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Solicitud;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.PersonaService;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.ProductoService;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.SolicitudService;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.TipoPersona;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ControladorRest {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private SolicitudService solicitudService;
    
    @Autowired
    private TipoPersonaService tpservice;

    // Métodos para Persona
    @GetMapping("/personas")
    public List<Persona> listarPersonas() {
        return personaService.listar();
    }

    @PostMapping("/agregar_personas")
    public Persona agregarPersona(@RequestBody Persona p) {
        return personaService.add(p);
    }

    @GetMapping("/personas/{id}")
    public Persona listarPersonaId(@PathVariable("id") int id) {
        return personaService.listarId(id);
    }

    @PutMapping("/editar_personas/{id}")
    public Persona editarPersona(@RequestBody Persona p, @PathVariable("id") int id) {
        p.setPersonaId(id);
        return personaService.edit(p);
    }

    @DeleteMapping("/personas/{id}")
    public void eliminarPersona(@PathVariable("id") int id) {
        personaService.delete(id);
    }

    // Métodos para Producto
    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return productoService.listar();
    }

    @PostMapping("/agregar_productos")
    public Producto agregarProducto(@RequestBody Producto p) {
        return productoService.add(p);
    }

    @GetMapping("/productos/{id}")
    public Producto listarProductoId(@PathVariable("id") int id) {
        return productoService.listarId(id);
    }

    @PutMapping("/editar_productos/{id}")
    public Producto editarProducto(@RequestBody Producto p, @PathVariable("id") int id) {
        p.setProductoId(id);
        return productoService.edit(p);
    }

    @DeleteMapping("/productos/{id}")
    public void eliminarProducto(@PathVariable("id") int id) {
        productoService.delete(id);
    }

    // Métodos para Solicitud
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

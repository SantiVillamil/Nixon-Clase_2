
package co.edu.Entidad.Financiera_Solicitud.de.TC.infraestructura;

import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Persona;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ControladorRest {

    @Autowired
    private PersonaService personaService;

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
}

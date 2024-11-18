
package co.edu.Entidad.Financiera_Solicitud.de.TC.infraestructura;

import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.Producto;
import co.edu.Entidad.Financiera_Solicitud.de.TC.domain.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ProductoRest {
    
    @Autowired
    private ProductoService productoService;
    
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
    
}

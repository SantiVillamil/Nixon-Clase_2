
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Solicitud")
public class Solicitud {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer solicitudId;

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private Date fechaSolicitud;

    @Column(nullable = false, length = 50)
    private String estado;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal montoSolicitado;

    @Column(nullable = false, length = 50)
    private String resultadoVerificacion;

    @Column(nullable = false)
    private Date fechaAprobacion;

    @Column(nullable = false)
    private Date fechaRechazo;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comentarios;

    // Getters y Setters
    public Integer getSolicitudId() { return solicitudId; }
    public void setSolicitudId(Integer solicitudId) { this.solicitudId = solicitudId; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public Date getFechaSolicitud() { return fechaSolicitud; }
    public void setFechaSolicitud(Date fechaSolicitud) { this.fechaSolicitud = fechaSolicitud; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public BigDecimal getMontoSolicitado() { return montoSolicitado; }
    public void setMontoSolicitado(BigDecimal montoSolicitado) { this.montoSolicitado = montoSolicitado; }

    public String getResultadoVerificacion() { return resultadoVerificacion; }
    public void setResultadoVerificacion(String resultadoVerificacion) { this.resultadoVerificacion = resultadoVerificacion; }

    public Date getFechaAprobacion() { return fechaAprobacion; }
    public void setFechaAprobacion(Date fechaAprobacion) { this.fechaAprobacion = fechaAprobacion; }

    public Date getFechaRechazo() { return fechaRechazo; }
    public void setFechaRechazo(Date fechaRechazo) { this.fechaRechazo = fechaRechazo; }

    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
    
}

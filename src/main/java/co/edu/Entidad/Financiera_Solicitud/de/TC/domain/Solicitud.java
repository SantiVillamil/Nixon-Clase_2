
package co.edu.Entidad.Financiera_Solicitud.de.TC.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    private int persona_id;
    private int producto_id;

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

    public Integer getPersona () { return persona_id; }
    public void setPersona(Integer persona_id) { this.persona_id = persona_id; }

    public Integer getProducto() { return producto_id; }
    public void setProducto(Integer producto) { this.producto_id = producto; }

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

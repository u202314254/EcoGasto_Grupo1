package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Meta")

public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMeta;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "recurso", length = 50, nullable = false)
    private String recurso;

    @Column(name = "monto", nullable = false)
    private double monto;

    @Column(name = "fechainicio", nullable = false)
    private LocalDate fechainicio;

    @Column(name = "fechafin", nullable = false)
    private LocalDate fechafin;

    @Column(name = "estado", length = 50, nullable = false)
    private String estado;

    @Column(name = "progreso", nullable = false)
    private double progreso;
    public Meta(){}

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getProgreso() {
        return progreso;
    }

    public void setProgreso(double progreso) {
        this.progreso = progreso;
    }

    public Meta(int idMeta, Usuario usuario, String descripcion, double monto, LocalDate fechainicio, LocalDate fechafin, String estado, double progreso) {}
}

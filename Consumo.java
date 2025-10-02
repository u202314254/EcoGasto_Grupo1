package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "Consumo")

public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsumo;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;

    @Column(name = "cantidad", nullable = false)
    private Double cantidad;

    @Column(name = "costo", nullable = false)
    private Double costo;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;
    public Consumo() {}

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Consumo(int idConsumo, Usuario usuario, String tipo, Double cantidad, Double costo, LocalDateTime fecha, String descripcion) {}
}

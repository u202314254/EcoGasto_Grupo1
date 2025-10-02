package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    private double cantidad;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

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

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Consumo(int idConsumo, Usuario usuario, double cantidad, double costo, LocalDate fecha, String descripcion) {}
}

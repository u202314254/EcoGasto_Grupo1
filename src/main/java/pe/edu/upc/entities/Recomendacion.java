package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "Recomendacion")

public class Recomendacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecomendacion;

    @ManyToOne
    @JoinColumn(name = "idMeta", nullable = false)
    private Meta meta;

    @Column(name = "contenido", length = 200, nullable = false)
    private String contenido;

    @Column(name = "categoria",length = 200, nullable = false)
    private String categoria;

    @Column(name = "fechapublicacion", nullable = false)
    private LocalDateTime fechapublicacion;

    @Column(name = "fuente", length = 200, nullable = false)
    private String fuente;
    public Recomendacion() {}

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(LocalDateTime fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Recomendacion(int idRecomendacion, Meta meta, String contenido, String categoria, LocalDateTime fechapublicacion, String fuente) {}
}

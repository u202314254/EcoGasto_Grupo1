package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "seguridad")
public class Seguridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeguridad;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(name = "ultimoLogin", nullable = false)
    private LocalDateTime ultimoLogin;

    @Column(name = "ipDispositivos", length = 50, nullable = false)
    private String ipDispositivos;

    @Column(name = "intentosFallidos", nullable = false)
    private int intentosFallidos;

    public Seguridad() {}

    public int getIdSeguridad() {
        return idSeguridad;
    }

    public void setIdSeguridad(int idSeguridad) {
        this.idSeguridad = idSeguridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public String getIpDispositivos() {
        return ipDispositivos;
    }

    public void setIpDispositivos(String ipDispositivos) {
        this.ipDispositivos = ipDispositivos;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
}

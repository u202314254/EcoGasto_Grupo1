package pe.edu.upc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "estado", nullable = false)
    private Boolean estado;
    public Usuario() {}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(int idUsuario, String nombre, String correo, String password, Boolean estado) {}
}

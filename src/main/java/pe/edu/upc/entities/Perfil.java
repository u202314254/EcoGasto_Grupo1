package pe.edu.upc.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil")

public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerfil;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "distrito", length = 50, nullable = false)
    private String distrito;

    @Column(name = "tipohogar", length = 50, nullable = false)
    private String tipoHogar;

    @Column(name = "numPersonas", nullable = false)
    private int numPersonas;

    @Column(name = "genero", length = 50, nullable = false)
    private String genero;

    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;
    public Perfil(){}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getTipoHogar() {
        return tipoHogar;
    }

    public void setTipoHogar(String tipoHogar) {
        this.tipoHogar = tipoHogar;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuario getIdUsuario() {
        return usuario;
    }

    public void setIdUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Perfil(int idPerfil, Usuario usuario, int edad, String distrito, String tipoHogar, int numPersonas, String genero, String telefono) {}
}

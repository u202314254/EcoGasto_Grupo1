package pe.edu.upc.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @ManyToOne
    @JoinColumn(name = "idHogar", nullable = false)
    private Hogar hogar;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "estado", nullable = false)
    private boolean estado;
    public Usuario() {}

    public Usuario(int idUsuario, Hogar hogar, String correo, String password, boolean estado) {
        this.idUsuario = idUsuario;
        this.hogar = hogar;
        this.correo = correo;
        this.password = password;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Hogar getHogar() {
        return hogar;
    }

    public void setHogar(Hogar hogar) {
        this.hogar = hogar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

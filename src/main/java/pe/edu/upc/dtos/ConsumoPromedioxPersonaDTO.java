package pe.edu.upc.dtos;

import pe.edu.upc.entities.Recurso;
import pe.edu.upc.entities.Usuario;

import java.time.LocalDate;

public class ConsumoPromedioxPersonaDTO {
    private int idUsuario;
    private String tipoHogar;
    private String nombrePerfil;
    private String nombreRecurso;
    private double promedioCosto;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoHogar() {
        return tipoHogar;
    }

    public void setTipoHogar(String tipoHogar) {
        this.tipoHogar = tipoHogar;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public double getPromedioCosto() {
        return promedioCosto;
    }

    public void setPromedioCosto(double promedioCosto) {
        this.promedioCosto = promedioCosto;
    }
}

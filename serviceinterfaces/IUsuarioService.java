package pe.edu.upc.serviceinterfaces;

import pe.edu.upc.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario usuario);
}

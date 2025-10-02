package pe.edu.upc.serviceinterfaces;

import pe.edu.upc.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol rol);
}

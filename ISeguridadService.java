package pe.edu.upc.serviceinterfaces;


import pe.edu.upc.entities.Seguridad;

import java.util.List;

public interface ISeguridadService {
    public List<Seguridad> list();
    public void insert(Seguridad seguridad);
    public Seguridad listId(int id);
    public void delete(int seguridad);
    public void update(Seguridad seguridad);
    Seguridad listId(Integer id);

    List<Seguridad> findAll();
}

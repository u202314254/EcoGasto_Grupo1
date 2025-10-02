package pe.edu.upc.serviceinterfaces;

import pe.edu.upc.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {
    public List<Recomendacion> list();
    public void insert(Recomendacion recomendacion);
}

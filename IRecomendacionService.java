package pe.edu.upc.serviceinterfaces;

import pe.edu.upc.dtos.RecomendacionDTO;
import pe.edu.upc.dtos.RecomendacionSimpleDTO;
import pe.edu.upc.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {
    public List<Recomendacion> list();
    public void insert(Recomendacion recomendacion);
    public Recomendacion listId(int id);
    public void delete(int id);
    public void update(Recomendacion recomendacion);
    List<String[]> findRecomendacionesPorRecurso();
    List<RecomendacionSimpleDTO> buscarPorCategoria(String categoria);
}

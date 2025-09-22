package pe.edu.upc.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.entities.Meta;

import java.time.LocalDate;
import java.util.List;

public interface IMetaService {
    public List<Meta> list();
    public void insert(Meta meta);
    public Meta listId(int id);
    public void delete(int id);
    public void update(Meta meta);
    List<Meta> buscarFechafin(LocalDate fechafin);
}

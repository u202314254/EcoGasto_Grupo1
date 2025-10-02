package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Recurso;

import java.util.List;

@Repository
public interface IRecursoRepository extends JpaRepository<Recurso, Integer> {
    @Query(value="select r.id_recurso, r.nombre_recurso,\n" +
            "count(c.id_usuario) as total_usuarios\n" +
            "from recurso r\n" +
            "left join consumo c on r.id_recurso = c.id_recurso\n" +
            "group by r.id_recurso, r.nombre_recurso\n" +
            "order by total_usuarios desc", nativeQuery = true)
    public List<String[]> listarRecursos();
}

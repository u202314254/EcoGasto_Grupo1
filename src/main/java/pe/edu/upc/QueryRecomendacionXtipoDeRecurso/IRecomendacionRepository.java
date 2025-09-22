package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Recomendacion;

import java.util.List;

@Repository

public interface IRecomendacionRepository extends JpaRepository<Recomendacion, Integer> {
    @Query(value = "SELECT \n" +
            "    r.descripcion,\n" +
            "    r.fuente,\n" +
            "    rec.nombre_recurso AS nombre_recurso\n" +
            "FROM recomendacion r\n" +
            "JOIN meta m ON r.id_meta = m.id_meta\n" +
            "JOIN recurso rec ON m.id_recurso = rec.id_recurso\n" +
            "JOIN usuario u ON m.id_usuario = u.id_usuario\n" +
            "WHERE rec.nombre_recurso = rec.nombre_recurso;",
            nativeQuery = true)
    List<String[]> findRecomendacionesPorRecurso();
}

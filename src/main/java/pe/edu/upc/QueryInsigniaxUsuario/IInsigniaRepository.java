package pe.edu.upc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Insignia;

import java.util.List;

@Repository
public interface IInsigniaRepository extends JpaRepository<Insignia,Integer> {
    @Query(value = "SELECT i.nombre_logro, i.puntos\n" +
            "FROM insignia i\n" +
            "JOIN meta m ON i.id_meta = m.id_meta\n" +
            "WHERE m.id_usuario = m.id_usuario;", nativeQuery = true)
    List<String[]> obtenerInsigniasPorUsuario();
}

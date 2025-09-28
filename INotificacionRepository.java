package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Notificacion;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion,Integer> {
    @Query(value = "SELECT u.correo AS usuario, COUNT(n.id_notificacion) AS total_notificaciones " +
            "FROM usuario u " +
            "JOIN notificacion n ON u.id_usuario = n.id_usuario " +
            "GROUP BY u.correo",
            nativeQuery = true)
    List<String[]> obtenerNotificacionesPorUsuario();
}
package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Notificacion;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion,Integer> {
    @Query(value="SELECT\n" +
            "  COUNT(n.id_notificacion) AS \"Notificaciones No Leídas\"\n" +
            "FROM notificacion n\n" +
            "JOIN usuario u ON n.id_usuario = u.id_usuario\n" +
            "WHERE n.leido = FALSE;", nativeQuery = true)
    public List<String[]>NotificacionesNoLeido();
}
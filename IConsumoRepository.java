package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Consumo;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface IConsumoRepository extends JpaRepository<Consumo, Integer> {
    @Query(value = "SELECT r.nombre_recurso AS recurso, SUM(c.costo) AS total\n" +
            "FROM consumo c\n" +
            "JOIN recurso r ON c.id_recurso = r.id_recurso\n" +
            "GROUP BY r.nombre_recurso;", nativeQuery = true)
    List<String[]> obtenerGastosPorRecurso();

    @Query(value="Select u.id_usuario, h.tipohogar, p.nombre, r.nombre_recurso, avg(c.costo) from usuario u\n" +
            "\n" +
            "Join consumo c on u.id_usuario=c.id_usuario\n" +
            "\n" +
            "join recurso r on c.id_recurso = r.id_recurso\n" +
            "\n" +
            "join perfil p on u.id_usuario = p.id_usuario\n" +
            "join hogar h on u.id_hogar = h.id_hogar\n" +
            "\n" +
            "group by u.id_usuario, r.nombre_recurso, p.nombre, h.tipohogar",nativeQuery = true)
    List<Object[]> obtenerConsumoPromedioxPersona();

}

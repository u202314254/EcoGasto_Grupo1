package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.entities.Seguridad;

public interface ISeguridadRepository extends JpaRepository<Seguridad, Integer> {
}

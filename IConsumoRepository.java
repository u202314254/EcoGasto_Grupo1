package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Consumo;
@Repository

public interface IConsumoRepository extends JpaRepository<Consumo, Integer> {

}

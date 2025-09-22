package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Meta;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface IMetaRepository extends JpaRepository<Meta, Integer> {
    @Query("select met from Meta met WHERE met.fechafin = :fecha")
    List<Meta> buscarFechafin(@Param("fecha") LocalDate fecha);


}

package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Usuario;

import java.util.List;

@Repository

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query(value = "select u.id_usuario, u.correo,\n" +
            "p.nombre, p.edad, p.distrito, \n" +
            "p.num_personas, p.tipohogar\n" +
            "from usuario u join perfil p \n" +
            "on u.id_usuario = p.id_usuario\n" +
            "where u.estado = true\n" +
            "order by p.nombre", nativeQuery = true)
    public List<String[]> listarUsuariosActivos();
}

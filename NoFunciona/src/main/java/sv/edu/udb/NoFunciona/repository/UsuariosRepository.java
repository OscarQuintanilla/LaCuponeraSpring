package sv.edu.udb.NoFunciona.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.NoFunciona.entities.Usuarios;

@Repository("UsuariosRepository")
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

}

package sv.edu.udb.NoFunciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.edu.udb.NoFunciona.entities.Rubros;



@Repository("RubrosRepository")
public interface RubrosRepository extends JpaRepository<Rubros, String>{


}

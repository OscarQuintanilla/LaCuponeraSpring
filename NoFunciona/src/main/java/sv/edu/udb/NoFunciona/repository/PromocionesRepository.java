package sv.edu.udb.NoFunciona.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.edu.udb.NoFunciona.entities.Promocion;

@Repository("PromocionesRepository")
public interface PromocionesRepository extends JpaRepository<Promocion, Integer> {

}

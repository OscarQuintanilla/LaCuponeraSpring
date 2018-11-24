package sv.edu.udb.NoFunciona.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.edu.udb.NoFunciona.entities.Empresas;

@Repository("EmpresasRepository")
public interface EmpresasRepository extends JpaRepository<Empresas, Integer> {

}

package sv.edu.udb.NoFunciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.NoFunciona.entities.Clientes;

@Repository("ClientesRepository")
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{

}


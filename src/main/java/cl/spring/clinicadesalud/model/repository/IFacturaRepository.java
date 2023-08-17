package cl.spring.clinicadesalud.model.repository;

import cl.spring.clinicadesalud.model.entity.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends JpaRepository<Facturas, Integer> {

}

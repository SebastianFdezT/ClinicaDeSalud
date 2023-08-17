package cl.spring.clinicadesalud.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.spring.clinicadesalud.model.entity.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {

}

package cl.spring.clinicadesalud.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.spring.clinicadesalud.model.entity.HistorialMedico;

@Repository
public interface IHistorialMedicoRepository extends JpaRepository<HistorialMedico, Integer>{
	List<HistorialMedico> findByPacienteIdPaciente(int idPaciente);
}

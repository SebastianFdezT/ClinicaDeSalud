package cl.spring.clinicadesalud.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.spring.clinicadesalud.model.entity.HistorialMedico;
import cl.spring.clinicadesalud.model.repository.IHistorialMedicoRepository;

@Service
public class HistorialMedicoService {
	@Autowired
	private IHistorialMedicoRepository hmRepo;

	public HistorialMedicoService() {
		super();
	}
	
	public List<HistorialMedico> obtenerHistorialPorIdPaciente(int idPaciente) {
		/* return hmRepo.findByPacienteIdPaciente(idPaciente); */
		System.out.println("Consultando historial médico para el id de paciente: " + idPaciente);

	    List<HistorialMedico> historialMedico = hmRepo.findByPacienteIdPaciente(idPaciente);

	    System.out.println("Historial médico consultado para el id de paciente: " + idPaciente + " - Cantidad de registros: " + historialMedico.size());

	    return historialMedico;
    }

	public List<HistorialMedico> getAll() {
		return hmRepo.findAll();
	}

	public HistorialMedico getOne(int id) {
		/* return serRepo.getOne(id); */ // Lazy
		return hmRepo.findById(id).orElse(null);
	}

	public void create(HistorialMedico s) {
		hmRepo.save(s);
	}

	public void update(HistorialMedico s) {
		hmRepo.save(s);
	}

	public void delete(int id) {
		hmRepo.delete(getOne(id));
	}
}

package cl.spring.clinicadesalud.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.spring.clinicadesalud.model.entity.Paciente;
import cl.spring.clinicadesalud.model.repository.IPacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private IPacienteRepository pacRepo;
	
	public PacienteService() {
		super();
	}

	public List<Paciente> getAll() {
		return pacRepo.findAll();
	}

	public Paciente getOne(int id) {
		/* return serRepo.getOne(id); */ //Lazy
		return pacRepo.findById(id).orElse(null);
	}

	public void create(Paciente s) {
		pacRepo.save(s);
	}

	public void update(Paciente s) {
		pacRepo.save(s);
	}

	public void delete(int id) {
		pacRepo.delete(getOne(id));
	}
}

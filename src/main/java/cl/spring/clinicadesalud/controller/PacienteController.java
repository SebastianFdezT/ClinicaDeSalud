package cl.spring.clinicadesalud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cl.spring.clinicadesalud.model.entity.Paciente;
import cl.spring.clinicadesalud.model.service.PacienteService;


@RestController
public class PacienteController {
	@Autowired
    private PacienteService ps;
	
	@RequestMapping(value = "/pacientes", method = RequestMethod.GET)
	public ModelAndView mostrarServicios() {
		List<Paciente> pacientes = ps.getAll();
		return new ModelAndView("pacientes", "pacientes", pacientes);
	}
}

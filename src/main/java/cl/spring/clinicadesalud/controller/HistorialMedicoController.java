package cl.spring.clinicadesalud.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cl.spring.clinicadesalud.model.entity.HistorialMedico;
import cl.spring.clinicadesalud.model.service.HistorialMedicoService;

@RestController
public class HistorialMedicoController {
	@Autowired
    private HistorialMedicoService hms;

	@GetMapping("/mostrar-historial/{idPaciente}")
	public ModelAndView mostrarHistorialMedico(@PathVariable int idPaciente) {
	    List<HistorialMedico> historialMedico = hms.obtenerHistorialPorIdPaciente(idPaciente);
	    System.out.println("Historial médico consultado para el id de paciente: " + idPaciente + " - Cantidad de registros: " + historialMedico.size());
	    
	    ModelAndView modelAndView = new ModelAndView("historialMedico"); // Nombre de la plantilla JSP
	    modelAndView.addObject("historialMedico", historialMedico);
	    
	    return modelAndView;
	}
	
	@GetMapping("/editar-historial/{idHistorialMedico}")
	@Transactional
	public String mostrarPaginaEdicion(@PathVariable int idHistorialMedico, Model model) {
	    try {
	    	HistorialMedico historialMedico = hms.getOne(idHistorialMedico);
	        model.addAttribute("historialMedico", historialMedico);
	        return "editarHistorialMedico";
	    } catch (Exception e) {
	        throw new RuntimeException("Error al procesar la solicitud", e);
	    }
	}
}

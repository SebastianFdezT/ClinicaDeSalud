package cl.spring.clinicadesalud.calculodescuentos;

import java.util.List;

public class CalculoEspecialidadExperiencia implements ICalculoDescuento{

	@Override
	public double descuento(List<Detalle> detalles) {
		double totalDescuento = 0;

        for (Detalle detalle : detalles) {
            Medico medico = detalle.getMedico();
            String especialidad = medico.getEspecialidad();
            int experiencia = medico.getAñosExperiencia();

            if (experiencia < 10) {
                totalDescuento += 0.15;
            } else if ((especialidad.equals("Cardiólogo") || especialidad.equals("Neurólogo")) && experiencia > 10 && experiencia < 20) {
                totalDescuento += 0.05;
            } else if ((especialidad.equals("Endocrinólogo") || especialidad.equals("Oncólogo")) && experiencia > 5) {
                totalDescuento += 0.1;
            } else if (experiencia > 20) {
                totalDescuento += 0.05;
            }
        }
        return totalDescuento;
	}
}

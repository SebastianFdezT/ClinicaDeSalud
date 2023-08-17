package cl.spring.clinicadesalud.calculodescuentos;

import java.util.List;

public class CalculoEdad implements ICalculoDescuento {

	@Override
	public double descuento(List<Detalle> detalles) {
		double totalDescuento = 0;

		for (Detalle detalle : detalles) {
			Paciente paciente = detalle.getPaciente();
			int edad = paciente.getEdad();

			if (edad <= 5) {
				totalDescuento += 0.05; // 5%
			} else if (edad > 5 && edad < 13) {
				totalDescuento += 0.03; // 3%
			} else if (edad > 35 && edad < 60) {
				totalDescuento += 0.1; // 10%
			} else if (edad >= 60) {
				totalDescuento += 0.3; // 30%
			}
		}
		return totalDescuento;
	}
}

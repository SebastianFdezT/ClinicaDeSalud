package cl.spring.clinicadesalud.calculodescuentos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");

		Paciente paciente1 = new Paciente(3);
		Paciente paciente2 = new Paciente(10);
		Paciente paciente3 = new Paciente(30);
		Paciente paciente4 = new Paciente(50);
		Paciente paciente5 = new Paciente(70);

		Medico medico1 = new Medico("Cardiólogo", 5);
		Medico medico2 = new Medico("Neurólogo", 15);
		Medico medico3 = new Medico("Endocrinólogo", 8);
		Medico medico4 = new Medico("Dermatólogo", 12);
		Medico medico5 = new Medico("Oncólogo", 7);

		List<Detalle> detalles = new ArrayList<>();
		detalles.add(new Detalle(paciente1, medico1));
		detalles.add(new Detalle(paciente2, medico2));
		detalles.add(new Detalle(paciente3, medico3));
		detalles.add(new Detalle(paciente4, medico4));
		detalles.add(new Detalle(paciente5, medico5));

		ICalculoDescuento calculoEdad = new CalculoEdad();
		double descuentoCalculoEdad = calculoEdad.descuento(detalles);

		ICalculoDescuento calculoEspecialidadExperiencia = new CalculoEspecialidadExperiencia();
		double descuentoCalculoEspecialidadExperiencia = calculoEspecialidadExperiencia.descuento(detalles);

		System.out.println("Suma de los descuentos en decimales por la edad del paciente: " + descuentoCalculoEdad);
		System.out.println("Suma de los descuentos en decimales por la especialidad y experiencia del doctor: "
				+ descuentoCalculoEspecialidadExperiencia);
		System.out.println("-----------------------------------------------");
	}

}

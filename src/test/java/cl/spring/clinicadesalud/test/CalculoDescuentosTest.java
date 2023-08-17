package cl.spring.clinicadesalud.test;

import cl.spring.clinicadesalud.calculodescuentos.CalculoEdad;
import cl.spring.clinicadesalud.calculodescuentos.CalculoEspecialidadExperiencia;
import cl.spring.clinicadesalud.calculodescuentos.ICalculoDescuento;
import cl.spring.clinicadesalud.calculodescuentos.Detalle;
import cl.spring.clinicadesalud.calculodescuentos.Medico;
import cl.spring.clinicadesalud.calculodescuentos.Paciente;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculoDescuentosTest {
	@Test
    public void testDescuentoMenosDe10Años() {
        List<Detalle> detalles = new ArrayList<>();
        Medico medico = new Medico("Cardiólogo", 5);
        detalles.add(new Detalle(new Paciente(),medico));
        
        CalculoEspecialidadExperiencia calculo = new CalculoEspecialidadExperiencia();
        double descuento = calculo.descuento(detalles);
        
        assertEquals(0.15, descuento);
    }
	
	@Test
    public void testCardiologoCon10a20AñosExperiencia() {
		List<Detalle> detalles = new ArrayList<>();
        Medico medico = new Medico("Cardiólogo", 15);
        detalles.add(new Detalle(new Paciente(),medico));

        CalculoEspecialidadExperiencia calculo = new CalculoEspecialidadExperiencia();
        assertEquals(0.05, calculo.descuento(detalles));
    }
}

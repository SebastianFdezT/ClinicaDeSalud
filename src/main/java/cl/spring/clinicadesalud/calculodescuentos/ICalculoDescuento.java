package cl.spring.clinicadesalud.calculodescuentos;

import java.util.List;

public interface ICalculoDescuento {
	public double descuento(List<Detalle> detalles);
}

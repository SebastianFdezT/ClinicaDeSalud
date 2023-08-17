package cl.spring.clinicadesalud.model.service;

import cl.spring.clinicadesalud.model.entity.Facturas;
import cl.spring.clinicadesalud.model.repository.IFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private IFacturaRepository facturaRepository;

    public List<Facturas> listarFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<Facturas> obtenerFacturaPorId(int idFactura) {
        return facturaRepository.findById(idFactura);
    }

    public void guardarFactura(Facturas factura) {
        facturaRepository.save(factura);
    }

    public void eliminarFactura(int idFactura) {
        facturaRepository.deleteById(idFactura);
    }
}

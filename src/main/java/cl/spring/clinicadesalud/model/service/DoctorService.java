package cl.spring.clinicadesalud.model.service;

import cl.spring.clinicadesalud.model.entity.Doctor;
import cl.spring.clinicadesalud.model.repository.IDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private IDoctorRepository doctorRepository;

    public List<Doctor> listarDoctores() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> obtenerDoctorPorId(int idDoctor) {
        return doctorRepository.findById(idDoctor);
    }

    public void guardarDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void eliminarDoctor(int idDoctor) {
        doctorRepository.deleteById(idDoctor);
    }
}

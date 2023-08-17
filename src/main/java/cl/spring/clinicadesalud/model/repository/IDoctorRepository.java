package cl.spring.clinicadesalud.model.repository;

import cl.spring.clinicadesalud.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
    
}

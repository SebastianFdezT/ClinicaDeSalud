package cl.spring.clinicadesalud.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.spring.clinicadesalud.model.entity.Especialidad;

public interface IEspecialidadRepository extends JpaRepository<Especialidad, Integer>{

}

SELECT p.Nombre as 'Nombre del paciente', c.Fecha as 'Fecha de la cita', d.Nombre as 'Nombre del doctor' FROM clinicadesalud.pacientes p 
JOIN clinicadesalud.citas c ON p.ID = c.Paciente_ID
JOIN clinicadesalud.doctores d ON c.Doctor_ID = d.ID;
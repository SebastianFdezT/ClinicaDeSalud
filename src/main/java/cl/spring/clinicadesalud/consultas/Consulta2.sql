SELECT d.Nombre as 'Nombre del doctor que tiene cita con Juan Pérez', e.Nombre as 'Nombre de la especialidad' FROM clinicadesalud.pacientes p 
JOIN clinicadesalud.citas c ON p.ID = c.Paciente_ID
JOIN clinicadesalud.doctores d ON c.Doctor_ID = d.ID 
JOIN clinicadesalud.especialidades e ON d.Especialidad_ID = e.ID 
WHERE p.Nombre='Juan Pérez';
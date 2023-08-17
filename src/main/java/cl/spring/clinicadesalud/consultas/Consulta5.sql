SELECT d.Nombre as 'Nombre del doctor', count(c.ID) as 'Número de citas' FROM clinicadesalud.doctores d
JOIN clinicadesalud.citas c ON d.ID = c.Doctor_ID
JOIN clinicadesalud.pacientes p ON c.Paciente_ID = p.ID
GROUP BY d.ID;
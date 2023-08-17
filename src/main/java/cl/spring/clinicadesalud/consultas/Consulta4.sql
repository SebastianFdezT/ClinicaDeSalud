SELECT p.ID AS Paciente_ID, p.Nombre AS Nombre_Paciente, hc.Diagnostico, hc.Tratamiento
FROM Pacientes p
JOIN Historia_Clinica hc ON p.ID = hc.Paciente_ID
WHERE hc.Fecha_Cita = (
    SELECT MAX(Fecha_Cita)
    FROM Historia_Clinica
    WHERE Paciente_ID = p.ID
)
ORDER BY p.ID ASC;

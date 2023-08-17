SELECT d.Nombre as 'Nombre del doctor', sum(f.Monto) as 'Monto total facturado' FROM clinicadesalud.facturas f 
JOIN clinicadesalud.citas c ON f.ID = c.Factura_ID
JOIN clinicadesalud.doctores d ON c.Doctor_ID = d.ID
GROUP BY d.ID ORDER BY d.Nombre DESC;
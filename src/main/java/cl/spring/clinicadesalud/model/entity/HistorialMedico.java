package cl.spring.clinicadesalud.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historia_clinica")
public class HistorialMedico {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHistorialMedico;
	@ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private Paciente paciente;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "Doctor_ID") private Doctor doctor;
	 */
	@Column(name = "Fecha_Cita")
	private LocalDate fechaCita;
	@Column(name = "Sintomas")
	private String sintomas;
	@Column(name = "Diagnostico")
	private String diagnostico;
	@Column(name = "Tratamiento")
	private String tratamiento;
	
	public HistorialMedico() {

    }
	
	public HistorialMedico(Paciente paciente, LocalDate fechaCita, String sintomas, String diagnostico, String tratamiento) {
        this.paciente = paciente;
        this.fechaCita = fechaCita;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
	
	public int getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(int idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

	/*
	 * public Doctor getDoctor() { return doctor; }
	 * 
	 * public void setDoctor(Doctor doctor) { this.doctor = doctor; }
	 */

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

}

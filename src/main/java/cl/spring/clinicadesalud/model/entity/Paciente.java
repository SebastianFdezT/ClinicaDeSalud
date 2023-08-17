package cl.spring.clinicadesalud.model.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	@Column(name = "Nombre")
	private String nombrePaciente;
	@Column(name = "Fecha_Nacimiento")
	private LocalDate fechaNacimiento;
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<HistorialMedico> historialesMedicos;
	
	public Paciente() {

	}

	public Paciente(String nombrePaciente, LocalDate fechaNacimiento) {
        this.nombrePaciente = nombrePaciente;
        this.fechaNacimiento = fechaNacimiento;
    }

	public int getIdPaciente() {
		return idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public List<HistorialMedico> getHistorialesMedicos() {
        return historialesMedicos;
    }

    public void setHistorialesMedicos(List<HistorialMedico> historialesMedicos) {
        this.historialesMedicos = historialesMedicos;
    }
}

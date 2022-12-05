package servico;

import java.sql.SQLException;

import DAO.PacienteDAO;
import model.Paciente;

public class ServicoPaciente {
	private PacienteDAO pacienteDAO = new PacienteDAO();
	
	public Paciente salvar(Paciente entidade) {
		return pacienteDAO.insert(entidade);
	}

	public Paciente buscarPorId(Long id) {
		return pacienteDAO.findById(id);
	}

	public void update(Paciente paciente) throws SQLException {
		pacienteDAO.updatePaciente(paciente);
	}

	public void remover(Integer id) throws SQLException {
		pacienteDAO.deletePaciente(id);
	}
}

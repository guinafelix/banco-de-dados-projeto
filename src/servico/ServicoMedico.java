package servico;

import java.sql.SQLException;

import DAO.MedicoDAO;
import model.Medico;

public class ServicoMedico {
	private MedicoDAO medicoDAO = new MedicoDAO();
	
	public Medico salvar(Medico entidade) {
		return medicoDAO.insert(entidade);
	}

	public Medico buscarPorId(Long id) {
		return medicoDAO.findById(id);
	}

	public void update(Medico Medico) throws SQLException {
		medicoDAO.updateMedico(Medico);
	}

	public void remover(Integer id) throws SQLException {
		medicoDAO.deleteMedico(id);
	}
}

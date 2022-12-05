package servico;

import java.sql.SQLException;

import DAO.ConsultaMedicaDAO;
import model.ConsultaMedica;

public class ServicoConsultaMedica {
	private ConsultaMedicaDAO consultaMedicaDAO = new ConsultaMedicaDAO();

	public ConsultaMedica salvar(ConsultaMedica entidade) {
		return consultaMedicaDAO.insert(entidade);
	}

	public ConsultaMedica buscarPorId(Integer id) {
		return consultaMedicaDAO.findById(id);
	}

	public void update(ConsultaMedica entidade) throws SQLException {
		consultaMedicaDAO.updateConsultaMedica(entidade);
	}

	public void remover(Integer id) throws SQLException {
		consultaMedicaDAO.deleteConsultaMedica(id);
	}
}

package servico;

import java.sql.SQLException;

import DAO.ResultadoExameDAO;
import model.ResultadoExame;

public class ServicoResultadoExame {
	private ResultadoExameDAO resultadoExameDAO = new ResultadoExameDAO();

	public ResultadoExame salvar(ResultadoExame entidade) {
		return resultadoExameDAO.insert(entidade);
	}

	public ResultadoExame buscarPorId(Integer id) {
		return resultadoExameDAO.findById(id);
	}

	public void update(ResultadoExame entidade) throws SQLException {
		resultadoExameDAO.updateResultadoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		resultadoExameDAO.deleteResultadoExame(id);
	}
}

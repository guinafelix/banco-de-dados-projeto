package servico;

import java.sql.SQLException;

import DAO.ComposicaoExameDAO;
import model.ComposicaoExame;

public class ServicoComposicaoExame {
	private ComposicaoExameDAO composicaoExameDAO = new ComposicaoExameDAO();

	public ComposicaoExame salvar(ComposicaoExame entidade) {
		return composicaoExameDAO.insert(entidade);
	}

	public ComposicaoExame buscarPorId(Integer id) {
		return composicaoExameDAO.findById(id);
	}

	public void update(ComposicaoExame entidade) throws SQLException {
		composicaoExameDAO.updateComposicaoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		composicaoExameDAO.deleteComposicaoExame(id);
	}
}

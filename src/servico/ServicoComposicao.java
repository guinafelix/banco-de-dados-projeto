package servico;

import java.sql.SQLException;

import DAO.ComposicaoDAO;
import model.Composicao;

public class ServicoComposicao {
	private ComposicaoDAO composicaoDAO = new ComposicaoDAO();

	public Composicao salvar(Composicao entidade) {
		return composicaoDAO.insert(entidade);
	}

	public Composicao buscarPorId(Integer id) {
		return composicaoDAO.findById(id);
	}

	public void update(Composicao entidade) throws SQLException {
		composicaoDAO.updateComposicao(entidade);
	}

	public void remover(Integer id) throws SQLException {
		composicaoDAO.deleteComposicao(id);
	}
}

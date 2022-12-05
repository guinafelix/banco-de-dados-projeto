package servico;

import java.sql.SQLException;

import DAO.SolicitacaoExameDAO;
import model.SolicitacaoExame;

public class ServicoSolicitacaoExame {
	private SolicitacaoExameDAO solicitacaoExameDAO = new SolicitacaoExameDAO();

	public SolicitacaoExame salvar(SolicitacaoExame entidade) {
		return solicitacaoExameDAO.insert(entidade);
	}

	public SolicitacaoExame buscarPorId(Integer id) {
		return solicitacaoExameDAO.findById(id);
	}

	public void update(SolicitacaoExame entidade) throws SQLException {
		solicitacaoExameDAO.updateSolicitacaoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		solicitacaoExameDAO.deleteSolicitacaoExame(id);
	}
}

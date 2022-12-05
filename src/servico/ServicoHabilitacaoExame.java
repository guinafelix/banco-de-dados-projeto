package servico;

import java.sql.SQLException;

import DAO.HabilitacaoExameDAO;
import model.HabilitacaoExame;

public class ServicoHabilitacaoExame {
	private HabilitacaoExameDAO habilitacaoExame = new HabilitacaoExameDAO();

	public HabilitacaoExame salvar(HabilitacaoExame entidade) {
		return habilitacaoExame.insert(entidade);
	}

	public HabilitacaoExame buscarPorId(Integer id) {
		return habilitacaoExame.findById(id);
	}

	public void update(HabilitacaoExame entidade) throws SQLException {
		habilitacaoExame.updateHabilitacaoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		habilitacaoExame.deleteHabilitacaoExame(id);
	}
}

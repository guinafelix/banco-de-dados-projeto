package servico;

import java.sql.SQLException;

import DAO.LaudoDAO;
import model.Laudo;

public class ServicoLaudo {
	private LaudoDAO laudoDAO = new LaudoDAO();

	public Laudo salvar(Laudo entidade) {
		return laudoDAO.insert(entidade);
	}

	public Laudo buscarPorId(Integer id) {
		return laudoDAO.findById(id);
	}

	public void update(Laudo entidade) throws SQLException {
		laudoDAO.updateLaudo(entidade);
	}

	public void remover(Integer id) throws SQLException {
		laudoDAO.deleteLaudo(id);
	}
}

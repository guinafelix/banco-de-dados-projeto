package servico;

import java.sql.SQLException;

import DAO.TipoExameDAO;
import model.TipoExame;

public class ServicoTipoExame {
	private TipoExameDAO tipoExameDAO = new TipoExameDAO();

	public TipoExame salvar(TipoExame entidade) {
		return tipoExameDAO.insert(entidade);
	}

	public TipoExame buscarPorId(Integer id) {
		return tipoExameDAO.findById(id);
	}

	public void update(TipoExame entidade) throws SQLException {
		tipoExameDAO.updateTipoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		tipoExameDAO.deleteTipoExame(id);
	}
}

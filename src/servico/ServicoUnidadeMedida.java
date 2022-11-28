package servico;

import java.sql.SQLException;

import DAO.UnidadeMedidaDAO;
import model.UnidadeMedida;


public class ServicoUnidadeMedida {
	private UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();
	
	public UnidadeMedida salvar(UnidadeMedida entidade) {
		return unidadeMedidaDAO.insert(entidade);
	}

	public UnidadeMedida buscarPorId(Long id) {
		return unidadeMedidaDAO.findById(id);
	}

	public void update(UnidadeMedida UnidadeMedida) throws SQLException {
		unidadeMedidaDAO.updateUnidadeMedida(UnidadeMedida);
	}

	public void remover(Integer id) throws SQLException {
		unidadeMedidaDAO.deleteUnidadeMedida(id);
	}
}
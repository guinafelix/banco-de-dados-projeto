package servico;

import java.sql.SQLException;

import DAO.ContatoDAO;
import model.Contato;

public class ServicoContato {
	private ContatoDAO contatoDAO = new ContatoDAO();

	public Contato salvar(Contato entidade) {
		return contatoDAO.insert(entidade);
	}

	public Contato buscarPorId(Integer id) {
		return contatoDAO.findById(id);
	}

	public void update(Contato entidade) throws SQLException {
		contatoDAO.updateContato(entidade);
	}

	public void remover(Integer id) throws SQLException {
		contatoDAO.deleteContato(id);
	}
}

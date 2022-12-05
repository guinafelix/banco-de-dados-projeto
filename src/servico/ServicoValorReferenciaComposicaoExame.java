package servico;

import java.sql.SQLException;

import DAO.ValorReferenciaComposicaoExameDAO;
import model.ValorReferenciaComposicaoExame;

public class ServicoValorReferenciaComposicaoExame {
	private ValorReferenciaComposicaoExameDAO valorReferenciaComposicaoExameDAO = new ValorReferenciaComposicaoExameDAO();

	public ValorReferenciaComposicaoExame salvar(ValorReferenciaComposicaoExame entidade) {
		return valorReferenciaComposicaoExameDAO.insert(entidade);
	}

	public ValorReferenciaComposicaoExame buscarPorId(Integer id) {
		return valorReferenciaComposicaoExameDAO.findById(id);
	}

	public void update(ValorReferenciaComposicaoExame entidade) throws SQLException {
		valorReferenciaComposicaoExameDAO.updateValorReferenciaComposicaoExame(entidade);
	}

	public void remover(Integer id) throws SQLException {
		valorReferenciaComposicaoExameDAO.deleteValorReferenciaComposicaoExame(id);
	}
}	

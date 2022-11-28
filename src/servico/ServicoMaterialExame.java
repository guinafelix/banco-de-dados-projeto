package servico;

import java.sql.SQLException;

import DAO.MaterialExameDAO;
import model.MaterialExame;


public class ServicoMaterialExame {
	private MaterialExameDAO materialExameDAO = new MaterialExameDAO();
	
	public MaterialExame salvar(MaterialExame entidade) {
		return materialExameDAO.insert(entidade);
	}

	public MaterialExame buscarPorId(Long id) {
		return materialExameDAO.findById(id);
	}

	public void update(MaterialExame MaterialExame) throws SQLException {
		materialExameDAO.updateMaterialExame(MaterialExame);
	}

	public void remover(Integer id) throws SQLException {
		materialExameDAO.deleteMaterialExame(id);
	}
}

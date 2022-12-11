package servico;

import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;

public class ServicoResponsavelTecnicoHasLaboratorio {
    private ResponsavelTecnicoHasLaboratorioDAO responsavelTecnicoHasLaboratorioDAO = new ResponsavelTecnicoHasLaboratorioDAO();

    public ResponsavelTecnicoHasLaboratorio salvar(ResponsavelTecnicoHasLaboratorio entidade) {
        return responsavelTecnicoHasLaboratorioDAO.insert(entidade);
    }

    public ResponsavelTecnicoHasLaboratorio buscarPorId(Integer id) {
        return responsavelTecnicoHasLaboratorioDAO.findById(id);
    }

    public void update(ResponsavelTecnicoHasLaboratorio entidade) throws SQLException {
        responsavelTecnicoHasLaboratorioDAO.updateResponsavelTecnicoHasLaboratorio(entidade);
    }

    public void remover(Integer id) throws SQLException {
        responsavelTecnicoHasLaboratorioDAO.deleteResponsavelTecnicoHasLaboratorio(id);
    }
}

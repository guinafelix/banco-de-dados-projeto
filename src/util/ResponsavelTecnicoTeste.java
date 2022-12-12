package util;

import model.ResponsavelTecnico;
import servico.ServicoResponsavelTecnico;
import servico.ServicoSiglaFormacao;

import java.sql.SQLException;

public class ResponsavelTecnicoTeste {
    public static ServicoResponsavelTecnico servicoResponsavelTecnico = new ServicoResponsavelTecnico();
    public static ServicoSiglaFormacao servicoSiglaFormacao = new ServicoSiglaFormacao();

    public static void main(String[] args) throws SQLException {
//        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico(
//                "asdasd",
//                "adfasd",
//                "rfgdfs",
//                servicoSiglaFormacao.buscarPorId(1));
//
//
//        // salvar
//        servicoResponsavelTecnico.salvar(responsavelTecnico);

        // listar
        System.out.println(servicoResponsavelTecnico.listarTodos());

        //buscar
        ResponsavelTecnico responsavelTecnico1 = servicoResponsavelTecnico.buscarPorId(1);

        //editar
        responsavelTecnico1.setConselho("conselho 50");
        servicoResponsavelTecnico.update(responsavelTecnico1);

        System.out.println(responsavelTecnico1);

    }
}

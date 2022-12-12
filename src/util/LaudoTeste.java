package util;

import model.Laudo;
import servico.ServicoLaudo;
import servico.ServicoSolicitacaoExame;

import java.sql.SQLException;

public class LaudoTeste {
    public static ServicoLaudo servicoLaudo = new ServicoLaudo();
    public static ServicoSolicitacaoExame servicoSolicitacaoExame = new ServicoSolicitacaoExame();

    public static void main(String[] args) throws SQLException {
        Laudo laudo = new Laudo(
                "Aasdf",
                "adfasdf",
                "wwqqq",
                servicoSolicitacaoExame.buscarPorId(1));

        // salvar
        servicoLaudo.salvar(laudo);

        // listar
        System.out.println(servicoLaudo.listarTodos());

        // buscar
        Laudo laudo1 = servicoLaudo.buscarPorId(1);

        // editar
        laudo1.setCodigo("cod_112");
        servicoLaudo.update(laudo1);

        System.out.println(servicoLaudo.buscarPorId(1));
    }
}

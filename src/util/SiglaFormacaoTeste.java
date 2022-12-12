package util;

import model.SiglaFormacao;
import servico.ServicoSiglaFormacao;

import java.sql.SQLException;

public class SiglaFormacaoTeste {
    public static ServicoSiglaFormacao servicoSiglaFormacao = new ServicoSiglaFormacao();

    public static void main(String[] args) throws SQLException {
        SiglaFormacao siglaFormacao = new SiglaFormacao("csc");

        //salvar
        servicoSiglaFormacao.salvar(siglaFormacao);
        System.out.println(servicoSiglaFormacao.buscarPorId(1));

        //editar
        SiglaFormacao siglaFormacao1 = servicoSiglaFormacao.buscarPorId(1);
        siglaFormacao1.setSigla("csc1");
        servicoSiglaFormacao.update(siglaFormacao1);

        //listar todos
        System.out.println(servicoSiglaFormacao.listarTodos());
    }
}

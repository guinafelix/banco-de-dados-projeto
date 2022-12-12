package util;

import model.ValorReferenciaComposicaoExame;
import servico.ServicoUnidadeMedida;
import servico.ServicoValorReferenciaComposicaoExame;

import java.sql.SQLException;

public class ValorReferenciaComposicaoExameTeste {
    public static ServicoUnidadeMedida servicoUnidadeMedida = new ServicoUnidadeMedida();
    public static ServicoValorReferenciaComposicaoExame servicoValorReferenciaComposicaoExame = new ServicoValorReferenciaComposicaoExame();

    public static void main(String[] args) throws SQLException {
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(
                "dfawdfa",
                "dfasdfa",
                "sadfdsaf",
                "adsfasdfa",
                servicoUnidadeMedida.buscarPorId(1));

        //salvar
        servicoValorReferenciaComposicaoExame.salvar(valorReferenciaComposicaoExame);

        // listar
        System.out.println(servicoValorReferenciaComposicaoExame.listarTodos());

        //buscar
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame1 = servicoValorReferenciaComposicaoExame.buscarPorId(1);

        //editar
        valorReferenciaComposicaoExame1.setValor_maximo("maximo3333");
        servicoValorReferenciaComposicaoExame.update(valorReferenciaComposicaoExame1);

        System.out.println(servicoValorReferenciaComposicaoExame.buscarPorId(1));
    }
}

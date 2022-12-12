package util;

import model.TipoExame;
import servico.ServicoExame;
import servico.ServicoTipoExame;

import java.sql.SQLException;

public class TipoExameTeste {
    private static ServicoTipoExame servicoTipoExame = new ServicoTipoExame();

    public static void main(String[] args) throws SQLException {
        //TipoExame tipoExame = new TipoExame("ultrassom", "zzzzzz");

        // salvar
        //servicoTipoExame.salvar(tipoExame);

        // listar
        System.out.println(servicoTipoExame.listarTodos());;

        //editar
        TipoExame tipoExame = servicoTipoExame.buscarPorId(1);
        tipoExame.setObservacao("qqqqqqq");
        servicoTipoExame.update(tipoExame);

        System.out.println(servicoTipoExame.listarTodos());;
    }
}

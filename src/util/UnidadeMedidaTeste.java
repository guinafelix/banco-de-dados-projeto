package util;

import model.UnidadeMedida;
import servico.ServicoUnidadeMedida;

import java.sql.SQLException;

public class UnidadeMedidaTeste {
    public static ServicoUnidadeMedida servicoUnidadeMedida = new ServicoUnidadeMedida();

    public static void main(String[] args) throws SQLException {
        UnidadeMedida unidadeMedida = new UnidadeMedida("metros cúbicos");

        // salvar
       // servicoUnidadeMedida.salvar(unidadeMedida);

        //listar
        System.out.println(servicoUnidadeMedida.listarTodos());

        //buscar
        UnidadeMedida unidadeMedida1 = servicoUnidadeMedida.buscarPorId(1);

        //editar
        unidadeMedida1.setDescricao("dm");
        servicoUnidadeMedida.update(unidadeMedida1);

        System.out.println(servicoUnidadeMedida.listarTodos());
    }
}

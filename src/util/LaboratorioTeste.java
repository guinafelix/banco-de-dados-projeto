package util;

import model.Laboratorio;
import servico.ServicoLaboratorio;

public class LaboratorioTeste {
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();

    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio("lab1", "www", "teste", "bbb", "gg");

        //salvar
        servicoLaboratorio.salvar(laboratorio);

        //listar
        System.out.println(servicoLaboratorio.listarTodos());

        //buscar
        Laboratorio laboratorio1 = servicoLaboratorio.buscarPorId(1);

        // editar
        laboratorio1.setDescricao("editando");
        System.out.println(laboratorio1);
    }
}

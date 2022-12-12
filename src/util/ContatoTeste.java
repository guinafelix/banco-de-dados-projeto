package util;

import model.Contato;
import servico.ServicoContato;
import servico.ServicoLaboratorio;

import java.sql.SQLException;

public class ContatoTeste {
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();
    public static ServicoContato servicoContato = new ServicoContato();

    public static void main(String[] args) throws SQLException {
//        Contato contato = new Contato("123444", servicoLaboratorio.buscarPorId(1));
//
//        // salvar
//        servicoContato.salvar(contato);

        // listar
        System.out.println(servicoContato.listarTodos());

        // buscar
        Contato contato1 = servicoContato.buscarPorId(1);

        //editar
        contato1.setTelefone("8775482283");
        servicoContato.update(contato1);

        System.out.println(servicoContato.buscarPorId(1));
    }
}

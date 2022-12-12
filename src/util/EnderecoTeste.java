package util;

import model.Endereco;
import servico.ServicoEndereco;
import servico.ServicoLaboratorio;

import java.sql.SQLException;

public class EnderecoTeste {
    public static ServicoEndereco servicoEndereco = new ServicoEndereco();
    public static ServicoLaboratorio servicoLaboratorio = new ServicoLaboratorio();

    public static void main(String[] args) throws SQLException {
//        Endereco endereco = new Endereco(
//                "adfa",
//                "asdsdds",
//                "asdasdsad",
//                "dsdd",
//                "adfasf",
//                "ddfdfsf",
//                servicoLaboratorio.buscarPorId(1));
//
//        // salvar
//        servicoEndereco.salvar(endereco);

        // listar
        System.out.println(servicoEndereco.listarTodos());

        //buscar
       Endereco endereco1 = servicoEndereco.buscarPorId(1);

        //editar
        endereco1.setRua("rua jjjjj");
        servicoEndereco.update(endereco1);

        System.out.println(endereco1);
    }
}

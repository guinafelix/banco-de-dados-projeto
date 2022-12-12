package util;

import model.Paciente;
import servico.ServicoPaciente;

import java.sql.SQLException;

public class PacienteTeste {
    public static ServicoPaciente servicoPaciente = new ServicoPaciente();

    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();
        Paciente paciente = new Paciente("antonio", new java.sql.Date(millis));

        //Salvar
        //servicoPaciente.salvar(paciente);

        //editar
//        Paciente paciente1 = servicoPaciente.buscarPorId(1);
//        paciente1.setNome("joao");
//        servicoPaciente.update(paciente1);

        //remover
        Paciente paciente1 = servicoPaciente.buscarPorId(1);
        servicoPaciente.remover(paciente1.getId().intValue());

        //Listar
        System.out.println(servicoPaciente.listarTodos());

    }
}

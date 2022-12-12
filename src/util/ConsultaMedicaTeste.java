package util;

import model.ConsultaMedica;
import servico.ServicoConsultaMedica;
import servico.ServicoMedico;
import servico.ServicoPaciente;

import java.sql.SQLException;

public class ConsultaMedicaTeste {
    public static ServicoConsultaMedica servicoConsultaMedica = new ServicoConsultaMedica();
    public static ServicoPaciente servicoPaciente = new ServicoPaciente();
    public static ServicoMedico servicoMedico = new ServicoMedico();
    public static void main(String[] args) throws SQLException {
        long millis = System.currentTimeMillis();
        ConsultaMedica consultaMedica = new ConsultaMedica(new java.sql.Date(millis),
                "oooaa",
                servicoPaciente.buscarPorId(2),
                servicoMedico.buscarPorId(1));

        //salvar
        servicoConsultaMedica.salvar(consultaMedica);

       // listar
        System.out.println(servicoConsultaMedica.listarTodos());

        //buscar
        ConsultaMedica consultaMedica1 = servicoConsultaMedica.buscarPorId(5);

        //editar
        consultaMedica1.setNm_atendimento("editando");
        servicoConsultaMedica.update(consultaMedica1);
        System.out.println(consultaMedica1);

        // remover
//        servicoConsultaMedica.remover(3);

    }
}

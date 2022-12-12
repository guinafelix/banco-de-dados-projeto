package util;

import model.Medico;
import servico.ServicoMedico;

import java.sql.SQLException;

public class MedicoTeste {
	public static ServicoMedico servicoMedico = new ServicoMedico();
	
	public static void main(String[] args) throws SQLException {
		//Medico med = new Medico("test", "crm");


//		// salvar
//		servicoMedico.salvar(med);

		// listar
		System.out.println(servicoMedico.listarTodos());

		// buscar
		Medico medico = servicoMedico.buscarPorId(1);

		// editar
		medico.setCrm("asdfas");
		servicoMedico.update(medico);

		System.out.println(servicoMedico.buscarPorId(1));
	}
}

package util;

import DAO.MedicoDAO;
import model.Medico;

public class Teste {
	static MedicoDAO medicoDAO = new MedicoDAO();
	
	public static void main(String[] args) {
		//Medico med = new Medico("test", "crm");
		//medicoDAO.insert(med);
		
		//System.out.println(medicoDAO.count());
		System.out.println(medicoDAO.selectAllMedicos());
	}
}

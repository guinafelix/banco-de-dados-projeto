package model;

public class SiglaFormacao extends GenericModel {
	private String sigla;
	
	

	public SiglaFormacao(Long id, String sigla) {
		this.sigla = sigla;
		super.setId(id);;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}

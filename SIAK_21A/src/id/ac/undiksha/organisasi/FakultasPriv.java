package id.ac.undiksha.organisasi;

public class FakultasPriv implements Fakultas {
	private String kodeFakultas;
	private String namaFakultas;
	
	
	public FakultasPriv() {
		super();
		 this.setKodeFakultas("(belum diisi)");
		 this.setNamaFakultas("(belum diisi)");
	 
	}

	
	public FakultasPriv(String kodeFakultas, String namaFakultas, String emailFakultas) {
		super();
		 this.kodeFakultas = kodeFakultas;
		 this.namaFakultas = namaFakultas;
		 this.EmailFakultas = emailFakultas;
	 
	}
	
	public void printlnAllinfo() {
		System.out.println("kodeFakultas = " + this.getKodeFakultas());
		System.out.println("namaFakultas = " + this.getNamaFakultas());
		System.out.println("EmailFakultas = " + this.getEmailFakultas());
		

	}
	

	private String EmailFakultas;
	
	
	
	public String getEmailFakultas() {
		return EmailFakultas;
	}


	public void setEmailFakultas(String emailFakultas) {
		EmailFakultas = emailFakultas;
	}


	public String getKodeFakultas() {
		return kodeFakultas;
	}
	public void setKodeFakultas(String kodeFakultas) {
		this.kodeFakultas = kodeFakultas;
	}
	public String getNamaFakultas() {
		return namaFakultas;
	}
	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
	}
	

}

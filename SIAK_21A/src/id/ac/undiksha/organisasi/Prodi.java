package id.ac.undiksha.organisasi;

public class Prodi implements Jurusan{
	
	private String kodeProdi;
	private String namaProdi;
	
	public Prodi() {		//contructor = tempat default value
		super();
		this.setKodeProdi("(kode prodi belum diisi)");				
		this.setNamaProdi("(nama prodi belum diisi)");		
	}

	public Prodi(String kodeProdi, String namaProdi, String kodeJurusan, String namaJurusan) {
		super();
		this.kodeProdi = kodeProdi;
		this.namaProdi = namaProdi;
		this.namaJurusan = namaJurusan;
		this.kodeJurusan = kodeJurusan;
	}
	
	public String getKodeProdi() {
		return kodeProdi;
	}
	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}
	public String getNamaProdi() {
		return namaProdi;
	}
	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	
	private String namaJurusan;
	private String kodeJurusan;

	@Override
	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
		
	}

	@Override
	public String getNamaJurusan() {
		return this.namaJurusan;
	}

	@Override
	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
		
	}

	@Override
	public String getKodeJurusan() {
		return this.kodeJurusan;
	}

	
}

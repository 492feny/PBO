package id.ac.undiksha.siak.entyties;

public class Mahasiswa extends Manusia{
	
	private String nim;
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public Mahasiswa() {
		this.setNim("(nim belum diisi)");				
		this.setProdi("(prodi belum diisi)");		
		this.setJurusan("(jurusan belum diisi)");		
		this.setFakultas("(fakultas belum diisi)");		
	}

	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin,
			String nim, String prodi, String jurusan, String fakultas) {
		
		super(nama, alamat, jenisKelamin);
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public Mahasiswa(String nim, String prodi, String jurusan, String fakultas) {
		super();
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIM: " 		+ this.getNim());
		System.out.println("Prodi: "	+ this.getProdi());
		System.out.println("Jurusan: " 	+ this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	
}

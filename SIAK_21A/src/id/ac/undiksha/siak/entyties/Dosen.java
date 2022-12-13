package id.ac.undiksha.siak.entyties;

public class Dosen extends Manusia{
//	private String nama;
//	private String alamat;
//	private boolean jenisKelamin;	//0 perempuan, 1 laki-laki
	private String nip;
	private String prodi;
	private String jurusan;
	private String fakultas;
	private String jabatan;
	
	public Dosen() {

		this.setNip("(nip belum diisi)");				
		this.setProdi("(prodi belum diisi)");		
		this.setJurusan("(jurusan belum diisi)");		
		this.setFakultas("(fakultas belum diisi)");		
	}
	
	
	
	public Dosen(String nama, String alamat, boolean jenisKelamin,
			String nip, String prodi, String jurusan, String fakultas, String jabatan) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.jabatan = jabatan;
	}



	public Dosen(String nip, String prodi, String jurusan, String fakultas, String jabatan) {
		super();
		this.nip = nip;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.jabatan = jabatan;
	}


	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIP: " 		+ this.getNip());
		System.out.println("Prodi: "	+ this.getProdi());
		System.out.println("Jurusan: " 	+ this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		System.out.println("Jabatan: " 	+ this.getJabatan());
		
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}



	public String getNip() {
		return nip;
	}



	public void setNip(String nip) {
		this.nip = nip;
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



	public String getJabatan() {
		return jabatan;
	}



	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
}

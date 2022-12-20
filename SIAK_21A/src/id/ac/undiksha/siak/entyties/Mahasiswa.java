package id.ac.undiksha.siak.entyties;

import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	
	private String nim;
	public Prodi prodi; //= new Prodi();
//	private String prodi; //prodi ini memiliki atribut lagi seperti kode prodi, koorprodi, dll sehingga prodi dijadikan menjadi class

	
	public Mahasiswa() {
		super();
		prodi = new Prodi();
		this.setNim("(nim belum diisi)");					
	}

	public Mahasiswa(String nama, String alamat, boolean jenisKelamin,
			String nim, String kodeProdi, String namaProdi) {
		
		super(nama, alamat, jenisKelamin);
		prodi = new Prodi(kodeProdi, namaProdi);
		this.nim = nim;
	}

	public void printAllinfo() {
		System.out.println("Nama: " 		+ this.getNama());
		System.out.println("Alamat: " 		+ this.getAlamat());
		System.out.println("NIM: " 			+ this.getNim());
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
		
		System.out.println("Kode Prodi: " 	+ this.prodi.getKodeProdi());
		System.out.println("Nama Prodi: " 	+ this.prodi.getNamaProdi());
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public Prodi getProdi() {
		return prodi;
	}

	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}

	
}

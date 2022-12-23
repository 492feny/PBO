package id.ac.undiksha.siak.entyties;

import id.ac.undiksha.organisasi.FakultasPriv;
import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	
	private String nim;
	public Prodi prodi; //= new Prodi();
//	private String prodi; //prodi ini memiliki atribut lagi seperti kode prodi, koorprodi, dll sehingga prodi dijadikan menjadi class
	public FakultasPriv fakultasPriv;
	
	
	public Mahasiswa() {
		super();
		prodi = new Prodi();
		fakultasPriv = new FakultasPriv();
		this.setNim("(nim belum diisi)");					
	}

	public void printAllinfo() {
		System.out.println("Nama: " 		+ this.getNama());
		System.out.println("Alamat: " 		+ this.getAlamat());
		System.out.println("NIM: " 			+ this.getNim());
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
		
		System.out.println("Kode Prodi: " 	+ this.prodi.getKodeProdi());
		System.out.println("Nama Prodi: " 	+ this.prodi.getNamaProdi());
		System.out.println("Nama Jurusan: " 	+ this.prodi.getNamaJurusan());
		System.out.println("Kode Jurusan: " 	+ this.prodi.getKodeJurusan());
		System.out.println("Nama Fakultas: " 	+ this.fakultasPriv.getNamaFakultas());
		System.out.println("Kode Fakultas: " 	+ this.fakultasPriv.getKodeFakultas());
		System.out.println("Email Fakultas: " 	+ this.fakultasPriv.getEmailFakultas());
		
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}

	public Mahasiswa(String nama, String alamat, boolean jenisKelamin,
			String nim, String kodeProdi, String namaProdi, String kodeJurusan, String namaJurusan, String namaFakultas, String kodeFakultas, String EmailFakultas) {
		
		super(nama, alamat, jenisKelamin);
		prodi = new Prodi(kodeProdi, namaProdi, kodeJurusan, namaJurusan);
		fakultasPriv = new FakultasPriv(namaFakultas, kodeFakultas, EmailFakultas);
		this.nim = nim;
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

	public FakultasPriv getFakultasPriv() {
		return fakultasPriv;
	}

	public void setFakultasPriv(FakultasPriv fakultasPriv) {
		this.fakultasPriv = fakultasPriv;
	}

	

	
//	public String getNim() {
//		return nim;
//	}
//
//	public void setNim(String nim) {
//		this.nim = nim;
//	}
//
//	public Prodi getProdi() {
//		return prodi;
//	}
//
//	public void setProdi(Prodi prodi) {
//		this.prodi = prodi;
//	}
//
//	
}

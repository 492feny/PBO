package id.ac.undiksha.siak.entyties;

public class Pegawai {
	private String nama;
	private String alamat;
	private boolean jenisKelamin;	//0 perempuan, 1 laki-laki
	private String nip;
	private String unit;
	
	public Pegawai() {
		this.setNama("(nama belum diisi)");
		this.setAlamat("(alamat belum diisi)");
		this.setNip("(nip belum diisi)");				
		this.setUnit("(unit belum diisi)");			
	}
	
	
	
	public Pegawai(String nama, String alamat, boolean jenisKelamin, String nip, String unit) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.nip = nip;
		this.unit = unit;
	}
	
	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIP: " 		+ this.getNip());
		System.out.println("Unit: "	+ this.getUnit());
		
		
		System.out.println("Jenis Kelamin:"
				+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
	}



	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}

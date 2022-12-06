package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entyties.Dosen;
import id.ac.undiksha.siak.entyties.Mahasiswa;
import id.ac.undiksha.siak.entyties.Pegawai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Adi");
		mhs1.printAllinfo();
		
		System.out.println();
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Budi",
				"Singaraja",
				true,
				"12344534",
				"Ilkom",
				"TI",
				"FTK");
		mhs2.printAllinfo();

		
//		System.out.println();
//		
//		Dosen dsn1 = new Dosen();
//		dsn1.setNama("Nama	:AgungYudhi");
//		
//		System.out.println(dsn1.getNama());
//		
//		System.out.println();
//		
//		Pegawai pgw1 = new Pegawai();
//		pgw1.setNama("Nama	:Arini");
//		
//		System.out.println(pgw1.getNama());
	}

}

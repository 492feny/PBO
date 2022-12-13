package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entyties.Dosen;
import id.ac.undiksha.siak.entyties.Mahasiswa;
import id.ac.undiksha.siak.entyties.Pegawai;

public class Main {

	public static void main(String[] args) {
//		Mahasiswa mhs1 = new Mahasiswa();
//		mhs1.setNama("Adi");
//		mhs1.printAllinfo();
//		
//		System.out.println();
		
		System.out.println("==MAHASISWA==");
		System.out.println();
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Feny",
				"Singaraja",
				false,
				"12344534",
				"Ilkom",
				"TI",
				"FTK");
		mhs2.printAllinfo();
		
		System.out.println();
		System.out.println("==DOSEN==");
		System.out.println();
		
		Dosen dsn1 = new Dosen(
				"Yudhi",
				"Singaraja",
				true,
				"12344534",
				"Ilkom",
				"TI",
				"FTK",
				"Dosen");
		dsn1.printAllinfo();
		
		System.out.println();
		System.out.println("==PEGAWAI==");
		System.out.println();
		
		Pegawai pgw1 = new Pegawai(
				"Dewi",
				"Singaraja",
				false,
				"12344534",
				"Admin");
		pgw1.printAllinfo();
		
		
//		System.out.println();
//		System.out.println("==DOSEN==");
//		System.out.println();
		
//		Dosen dsn1 = new Dosen(
//				"Yudhi",
//				"Singaraja",
//				true,
//				"1234453232",
//				"Ilkom",
//				"TI",
//				"FTK",
//				"Kaprodi");
//		dsn1.printAllinfo();
//		
//		System.out.println();
//		
//		Dosen dsn2 = new Dosen();
//		mhs1.setNama("Dewi");
//		mhs1.printAllinfo();
//		
//		System.out.println();
//		System.out.println("==PEGAWAI==");
//		System.out.println();
//		
//		Pegawai pgw1 = new Pegawai();
//		pgw1.setNama("Feny");
//		pgw1.printAllinfo();
//		
//		System.out.println();
//		
//		Manusia mns1 = new Manusia();
//		mns1.setNama("Feny");
//		mns1.printAllinfo();
		
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

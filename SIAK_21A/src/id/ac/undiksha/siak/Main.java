package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entyties.Dosen;
import id.ac.undiksha.siak.entyties.Mahasiswa;
import id.ac.undiksha.siak.entyties.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==MAHASISWA==");
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Feny",
				"Singaraja",
				false,
				"12344534",
				"21151010",
				"Ilmu Komputer"
//				"TI",
//				"15",
//				"FTK",
//				"10"
, "10", "TI", "Kode FTK", "FTK", "@undikshaftk.com"
			);
				
		mhs2.printAllinfo();

		System.out.println();
		System.out.println("==DOSEN==");
		
		Dosen dsn1 = new Dosen(
				"Pak Yudhi",
				"Singaraja",
				true,
				"12344534",
				"21151010",
				"Ilmu Komputer",
				"Kepala Prodi", "10", "TI"
			);
		
		dsn1.printAllinfo();
//		
		System.out.println();
		System.out.println("==PEGAWAI==");
		
		Pegawai pgw1 = new Pegawai(
				"Sinta",
				"Singaraja",
				false,
				"Puskom",
				"123234234"
			);
		
		pgw1.printAllinfo();
	}
}

import java.util.ArrayList;
public class Main {

	public static void main(String[] args){
		Manusia andi = new Manusia("Andi", 12);
		Mahasiswa budi = new Mahasiswa("Budi", 20, "2201234521", (float) 3.89);

		// //Memanggil method dari parent class Manusia
		// andi.ulangTahun();
		// budi.ulangTahun();

		// //Memanggil method dari parent class Manusia
		// System.out.println(budi.getUmur());

		//Membuat objeect Mahasiswa dan tampung di class Manusia
		Manusia chandra = new Mahasiswa("Chandra", 21, "2201243536", (float) 3.87);

		chandra.ulangTahun();
		//chandra.belajar();

		/*	parent tidak dapat mengakses child
		child dapat mengakses semua milik parent */

		// System.out.println(chandra.getUmur());

		//tidak dapat membuat object parent class(Manusia) dan tampung di child class(Mahasiswa)
		// Mahasiswa clarissa = new Manusia("Clarissa", 19);

		//ArrayList dari class
		ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

		listMahasiswa.add(budi);
		listMahasiswa.add(new Mahasiswa("Clarissa", 19, "2206765982", (float) 3.92));

		System.out.println(listMahasiswa.get(1).getIpk());


	}	
}